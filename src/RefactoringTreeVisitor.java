import java.util.*;

public class RefactoringTreeVisitor extends MiniJavaBaseVisitor {
    private List<String> childrenClasses = new ArrayList<>();
    private Map<String, List<String>> classesWithMethods = new HashMap<>();
    private Map<String, String> classesWithParents = new HashMap<>();
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
        String methodDeclaration = ctx.getChild(0).getText() + " " + ctx.getChild(1).getText() + " " + ctx.getChild(2).getText() + ctx.getChild(3).getText() + " " + ctx.getChild(4).getText();
        String className = ctx.getParent().getParent().getChild(1).getText();
        List<String> methodsFromClass;
        if (classesWithMethods.containsKey(className)) {
            methodsFromClass = classesWithMethods.get(className);
        } else {
            methodsFromClass = new ArrayList<>();
        }
        methodsFromClass.add(methodDeclaration);
        classesWithMethods.put(className, methodsFromClass);
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
}