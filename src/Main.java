import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            OutputStream stdOut = System.out;
            OutputStream stdErr = System.err;
            PrintStream ps = new PrintStream("output-file.txt");
            System.setOut(new PrintStream(new OutputStream() {
                @Override
                public void write(int b) throws IOException {
                    ps.write(b);
                    stdOut.write(b);
                }

                @Override
                public void flush() throws IOException {
                    super.flush();
                    ps.flush();
                    stdOut.flush();
                }

                @Override
                public void close() throws IOException {
                    super.close();
                    ps.close();
                }
            }));

            System.setErr(new PrintStream(new OutputStream() {
                @Override
                public void write(int b) throws IOException {
                    ps.write(b);
                    stdErr.write(b);
                }

                @Override
                public void flush() throws IOException {
                    super.flush();
                    ps.flush();
                    stdErr.flush();
                }

                @Override
                public void close() throws IOException {
                    super.close();
                    ps.close();
                }
            }));
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Please provide the name of the file:");
            Scanner input = new Scanner(System.in);
            String filename = input.nextLine();
            ps.append(filename + "\n");
            CharStream cs = CharStreams.fromFileName(filename);
            Path pathFile = Paths.get("output-file.txt");
            String outputLogFilename = FileHandler.generateOutputFilename(filename).replace(".java", "") + "-Log.txt";
            Path outputPathLogFile = Paths.get(outputLogFilename);
            if(Files.exists(outputPathLogFile)) {
                Files.delete(outputPathLogFile);
            }

            Files.move(pathFile, pathFile.resolveSibling(outputLogFilename));
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
            ps.append(classChoice + "\n");
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
                ps.append(methodChoice + "\n");
                String parentClass = miniJavaBaseVisitor.getClassesWithParents().get(chosenClassName);
                TokenStreamRewriter tokenStreamRewriter = new TokenStreamRewriter(tokens);
                List<String> parentClassMethodDeclarations = miniJavaBaseVisitor.getClassesWithMethodDeclaration().get(parentClass);
                System.out.println("-------------------------------------");
                chosenMethod = chosenMethod.replaceAll(" ", "");
                String pullUpMethodDeclaration = miniJavaBaseVisitor.getWholeMethodsWithDeclarations().get(chosenMethod);
                PullUpRefactorer pullUpRefactorer = new PullUpRefactorer(chosenMethod, chosenClassName, parentClass, tokenStreamRewriter, tokens, parentClassMethodDeclarations, pullUpMethodDeclaration);
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
