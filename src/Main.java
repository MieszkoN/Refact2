import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Please provide the name of the file:");
        Scanner input = new Scanner(System.in);
        String filename = input.nextLine();
        try {
            CharStream cs = CharStreams.fromFileName(filename);
            if (cs.size() == 0) {
                System.out.println("Input file is empty!");
                return;
            }
            MiniJavaLexer lexer = new MiniJavaLexer(cs);
            lexer.removeErrorListeners();
            lexer.reset();
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MiniJavaParser parser = new MiniJavaParser(tokens);
            ParseTree tree = parser.start();
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Please select the child class from which you want to pull up the method.");
            RefactoringTreeVisitor miniJavaBaseVisitor = new RefactoringTreeVisitor();
            miniJavaBaseVisitor.visit(tree);
            int i = 1;
            for(String className : miniJavaBaseVisitor.getChildrenClasses()) {
                System.out.println(i + ". " + className);
                i++;
            }
            System.out.println("---------------------------------------------------------------------------");
            int classChoice = chooseOption(miniJavaBaseVisitor.getChildrenClasses().size());
            String chosenClassName = miniJavaBaseVisitor.getChildrenClasses().get(classChoice-1);
            System.out.println("---------------------------------------------------------------------------");
            if (!miniJavaBaseVisitor.getClassesWithMethods().containsKey(chosenClassName)) {
                System.out.println("Chosen class does not contain any methods.");
            } else {
                int j = 1;
                System.out.println("Please select the method which you want to pull up:");
                for (String methodName : miniJavaBaseVisitor.getClassesWithMethods().get(chosenClassName)) {
                    System.out.println(j + ". " + methodName);
                    j++;
                }
                System.out.println("---------------------------------------------------------------------------");
                int methodChoice = chooseOption(miniJavaBaseVisitor.getClassesWithMethods().get(chosenClassName).size());
                String chosenMethod = miniJavaBaseVisitor.getClassesWithMethods().get(chosenClassName).get(methodChoice-1);
                String parentClass = miniJavaBaseVisitor.getClassesWithParents().get(chosenClassName);
                TokenStreamRewriter tokenStreamRewriter = new TokenStreamRewriter(tokens);
                PullUpRefactorer pullUpRefactorer = new PullUpRefactorer(chosenMethod, chosenClassName, parentClass, tokenStreamRewriter, tokens);
                pullUpRefactorer.visit(tree);
                tokenStreamRewriter = pullUpRefactorer.getTokenStreamRewriter();
                FileHandler.writeToFile(tokenStreamRewriter.getText(), filename);
                System.out.println("Refactoring finished successfully!");
            }
            input.close();
        } catch (IOException e) {
            System.out.println("There was a problem with the file!");
        }
    }

    private static int chooseOption(int optionsSize) {
        boolean correctOption = false;
        int choice = -1;
        while(!correctOption) {
            System.out.println("Provide your choice: ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                choice = scan.nextInt();
                if (choice <= optionsSize && choice > 0) {
                    correctOption = true;
                } else {
                    System.out.println("You did not provide correct option, try again!");
                }
            } else {
                System.out.println("You should provide the number, try again!");
            }
        }
        return choice;
    }
}

