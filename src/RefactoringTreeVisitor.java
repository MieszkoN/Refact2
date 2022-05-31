import java.util.*;

public class RefactoringTreeVisitor extends MiniJavaBaseVisitor {
    private List<String> childrenClasses = new ArrayList<>();
    private Map<String, List<String>> classesWithMethods = new HashMap<>();
    private Map<String, String> classesWithParents = new HashMap<>();
    private Map<String, List<String>> classesWithMethodDeclaration = new HashMap<>();
    private Map<String, String> wholeMethodsWithDeclarations = new HashMap<>();
    @Override
    public Object visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        if (ctx.getChild(2).getText().equals("extends")) {
            childrenClasses.add(ctx.getChild(1).getText());
            classesWithParents.put(ctx.getChild(1).getText(), ctx.getChild(3).getText());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        String methodDefinition = ctx.getChild(0).getText() + " " + ctx.getChild(1).getText() + " " + ctx.getChild(2).getText() + ctx.getChild(3).getText() + " " + ctx.getChild(4).getText();
        String methodDeclaration = ctx.Identifier().getText() + ctx.formalParameters().getText();
        String className = ctx.getParent().getParent().getChild(1).getText();
        List<String> methodsFromClass;
        if (classesWithMethods.containsKey(className)) {
            methodsFromClass = classesWithMethods.get(className);
        } else {
            methodsFromClass = new ArrayList<>();
        }
        methodsFromClass.add(methodDefinition);
        classesWithMethods.put(className, methodsFromClass);

        List<String> methodsDeclarationFromClass;
        if (classesWithMethodDeclaration.containsKey(className)) {
            methodsDeclarationFromClass = classesWithMethodDeclaration.get(className);
        } else {
            methodsDeclarationFromClass = new ArrayList<>();
        }
        methodsDeclarationFromClass.add(methodDeclaration);
        classesWithMethodDeclaration.put(className, methodsDeclarationFromClass);
        wholeMethodsWithDeclarations.put(ctx.getText(), methodDeclaration);
        return visitChildren(ctx);
    }

    public List<String> getChildrenClasses() {
        return childrenClasses;
    }
    public Map<String, List<String>> getClassesWithMethods() {
        return classesWithMethods;
    }
    public Map<String, String> getClassesWithParents() {
        return classesWithParents;
    }

    public Map<String, List<String>> getClassesWithMethodDeclaration() {
        return classesWithMethodDeclaration;
    }
    public Map<String, String> getWholeMethodsWithDeclarations() {
        return wholeMethodsWithDeclarations;
    }
}