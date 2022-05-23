public class RefactoringTreeVisitor extends MiniJavaBaseVisitor {
    @Override
    public Object visitMainClassDeclaration(MiniJavaParser.MainClassDeclarationContext ctx) {
        System.out.println("Test");
        return visitChildren(ctx);
    }
}
