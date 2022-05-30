import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.Interval;

public class PullUpRefactorer extends MiniJavaBaseVisitor {
    private String methodToPullUp;
    private String sourceClass;
    private String parentClass;
    private TokenStreamRewriter tokenStreamRewriter;
    private CommonTokenStream tokens;
    private boolean methodInParentClass = false;
    public PullUpRefactorer(String methodToPullUp, String sourceClass, String parentClass, TokenStreamRewriter tokenStreamRewriter, CommonTokenStream tokens) {
        this.methodToPullUp = methodToPullUp.replaceAll(" ", "");
        this.sourceClass = sourceClass;
        this.parentClass = parentClass;
        this.tokenStreamRewriter = tokenStreamRewriter;
        this.tokens = tokens;
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
        if (ctx.getParent().getParent().getChildCount() > 3) {
            currentMethodParentClass = ctx.getParent().getParent().getChild(3).getText();
            hasParent = true;
        }
        if (ctx.getText().equals(methodToPullUp) && parentClass.equals(currentMethodParentClass)) {
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
