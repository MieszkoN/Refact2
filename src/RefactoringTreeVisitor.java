import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class RefactoringTreeVisitor extends MiniJavaBaseVisitor {
//    public String methodToPullUp;
//    public Set<String> parentClasses = new HashSet<>();
    private List<String> classes = new ArrayList<>();
    private Map<String, List<String>> classesWithMethods = new HashMap<>();
    public Map<String, String> methodsWithParentClasses = new HashMap<>();
    public Map<String, String> duplicateMethods = new HashMap<>();

//    RefactoringTreeVisitor(String methodToPullUp) {
//        this.methodToPullUp = methodToPullUp;
//    }

//    @Override
//    public Object visit(ParseTree tree) {
//        for(Integer i = 0; i < tree.getChildCount()-1; i++) {
//            for(Integer j = 0; j < tree.getChild(i).getChildCount(); j++) {
//                for(Integer k = 0; k < tree.getChild(i).getChild(j).getChildCount(); k++) {
//                    System.out.println(tree.getChild(i).getChild(j).getChild(k).getText());
//                    if(tree.getChild(i).getChild(j).getChild(0).getText() != "{") {
////                        methodsWithParentClasses.put(tree.getChild(i).getChild(j).getChild(0).getText());
//                    }
//                }
//            }
//            System.out.println("------------------------------------------------------");
//        }
//        return tree;
//    }
//    @Override
//    public Object visitMainClassDeclaration(MiniJavaParser.MainClassDeclarationContext ctx) {
////        System.out.println(ctx.mainClassBody().mainMethod().mainMethodDeclaration().getText());
//        return visitChildren(ctx);
//    }
//
    @Override
    public Object visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        classes.add(ctx.getChild(1).getText());
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        String methodDeclaration = ctx.getChild(2).getText() + ctx.getChild(3).getText();
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

    public List<String> getClasses() {
        return classes;
    }

    public Map<String, List<String>> getClassesWithMethods() {
        return classesWithMethods;
    }
}
