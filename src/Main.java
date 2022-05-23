import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

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

            MiniJavaListener listener = new MiniJavaBaseListener();
            RefactoringTreeVisitor miniJavaBaseVisitor = new RefactoringTreeVisitor();
            miniJavaBaseVisitor.visit(tree);
            TokenStreamRewriter tokenStreamRewriter = new TokenStreamRewriter(tokens);
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree);
            System.out.println(tokenStreamRewriter.getText());
            writeToFile(tokenStreamRewriter.getText(), "Output.java");
            System.out.println("Refactoring finished successfully!");
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
