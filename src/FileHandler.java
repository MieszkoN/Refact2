import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    public static String generateOutputFilename(String inputFilename) {
        String outputFilename;
        switch(inputFilename) {
            case "Input1.java":
                outputFilename = "Output1.java";
                break;
            case "Input2.java":
                outputFilename = "Output2.java";
                break;
            case "Input3.java":
                outputFilename = "Output3.java";
                break;
            case "Input4.java":
                outputFilename = "Output4.java";
                break;
            case "Input5.java":
                outputFilename = "Output5.java";
                break;
            case "Input6.java":
                outputFilename = "Output6.java";
                break;
            case "Input7.java":
                outputFilename = "Output7.java";
                break;
            case "Input8.java":
                outputFilename = "Output8.java";
                break;
            case "Input9.java":
                outputFilename = "Output9.java";
                break;
            case "Input10.java":
                outputFilename = "Output10.java";
                break;
            default:
                outputFilename = "Output.java";
        }
        return outputFilename;
    }

    public static void writeToFile(String fileContent, String inputFilename){
        String filename = generateOutputFilename(inputFilename);
        try (FileWriter fileWriter = new FileWriter(filename)){
            fileWriter.write(fileContent);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
