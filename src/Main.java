import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Please provide the name of the file:");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        try {
            CharStream cs = CharStreams.fromFileName(fileName);
            MiniJavaLexer lexer = new MiniJavaLexer(cs);
            lexer.removeErrorListeners();
            lexer.reset();
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MiniJavaParser parser = new MiniJavaParser(tokens);
            ParseTree tree = parser.start();
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Please select the class from which you want to pull up the method.");
            RefactoringTreeVisitor miniJavaBaseVisitor = new RefactoringTreeVisitor();
            miniJavaBaseVisitor.visit(tree);
            int i = 1;
            for(String className : miniJavaBaseVisitor.getClasses()) {
                System.out.println(i + ". " + className);
                i++;
            }
            System.out.println("---------------------------------------------------------------------------");
            int classChoice = -1;
            boolean correctOption = false;
            while(!correctOption) {
                System.out.println("Provide your choice: ");
                Scanner scan = new Scanner(System.in);
                if (scan.hasNextInt()) {
                    classChoice = scan.nextInt();
                    correctOption = true;
                } else {
                    System.out.println("You did not provide correct option, try again!");
                }
            }

            String chosenClassName = miniJavaBaseVisitor.getClasses().get(classChoice-1);
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
                System.out.println("Provide your choice: ");

                TokenStreamRewriter tokenStreamRewriter = new TokenStreamRewriter(tokens);
                writeToFile(tokenStreamRewriter.getText(), "Output.java");
                System.out.println("Refactoring finished successfully!");
            }
            input.close();
        } catch (IOException e) {
            System.out.println("File with the given name was not found");
        }
    }
    private static void writeToFile(String fileContent, String fileName){
        try (FileWriter fileWriter = new FileWriter(fileName)){
            fileWriter.write(fileContent);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

