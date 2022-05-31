import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.Interval;

import java.util.List;

public class PullUpRefactorer extends MiniJavaBaseVisitor {
    private String methodToPullUp;
    private String sourceClass;
    private String parentClass;
    private TokenStreamRewriter tokenStreamRewriter;
    private CommonTokenStream tokens;
    private boolean methodInParentClass = false;
    private List<String> parentClassMethodDeclarations;
    private String pullUpMethodDeclaration;

    private boolean methodDeclarationInParentClass = false;
    public PullUpRefactorer(String methodToPullUp, String sourceClass, String parentClass, TokenStreamRewriter tokenStreamRewriter, CommonTokenStream tokens, List<String> parentClassMethodDeclarations, String pullUpMethodDeclaration) {
        this.methodToPullUp = methodToPullUp;
        this.sourceClass = sourceClass;
        this.parentClass = parentClass;
        this.tokenStreamRewriter = tokenStreamRewriter;
        this.tokens = tokens;
        this.parentClassMethodDeclarations = parentClassMethodDeclarations;
        this.pullUpMethodDeclaration = pullUpMethodDeclaration;
    }

    @Override
    public Object visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        if (ctx.Identifier().getText().equals(parentClass) && ctx.classBody().getText().contains(methodToPullUp)) {
            methodInParentClass = true;
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        String currentMethodParentClass = "";
        Boolean hasParent = false;
        String methodDeclaration = ctx.Identifier().getText() + ctx.formalParameters().getText();
        if (ctx.getParent().getParent().getChildCount() > 3) {
            currentMethodParentClass = ctx.getParent().getParent().getChild(3).getText();
            hasParent = true;
        }

        if (parentClassMethodDeclarations != null) {
            if (parentClassMethodDeclarations.contains(methodDeclaration) && !ctx.getText().equals(methodToPullUp) && methodDeclaration.equals(pullUpMethodDeclaration) && parentClass.equals(ctx.getParent().getParent().getChild(1).getText())) {
                methodDeclarationInParentClass = true;
            }
        }

        if (ctx.getText().equals(methodToPullUp) && parentClass.equals(currentMethodParentClass) && !methodDeclarationInParentClass) {
            int destination = getParentClassBodyStartIndex();
            if (!methodInParentClass) {
                tokenStreamRewriter.insertAfter(destination, "\n\t" + ctx.start.getInputStream().getText(Interval.of(ctx.start.getStartIndex(), ctx.stop.getStopIndex())) + "\n");
                methodInParentClass = true;
            }
            tokenStreamRewriter.delete(ctx.getStart(), ctx.getStop());
        }
        return visitChildren(ctx);
    }
    public TokenStreamRewriter getTokenStreamRewriter() {
        return tokenStreamRewriter;
    }

    private int getParentClassBodyStartIndex() {
        boolean start = false;
        int startIndex = -1;
        for (int i = 0; i < tokens.size(); i++) {
            if (tokens.get(i).getText().equals(parentClass)) {
                start = true;
            }
            if (tokens.get(i).getText().equals("{") && start) {
                startIndex = i;
                start = false;
                break;
            }
        }
        return startIndex;
    }
}
