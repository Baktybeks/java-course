import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main58 {
    public static void main(String[] args) {

        // How to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

//        String filePath = "test.txt";
//        String textContent = """
//                Roses are Red
//                Violets are Blue
//                BOOTY BOOTY BOOTY
//                ROCKIN' EVERWHERE!
//                """;
//
//        try(FileWriter writer = new FileWriter(filePath)){
//            writer.write(textContent);
//            System.out.println("File has been written");
//        }
//        catch(FileNotFoundException e){
//            System.out.println("Could not locate file location");
//        }
//        catch(IOException e){
//            System.out.println("Could not write file");
//        }
        String filePath = "F:\\!DESKTOP\\test.txt";

        String textContent = """
                I am writing to a file using FileWriter in Java.
                More
                lines
                are
                here.
                One more line.
                """;

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written");
        } catch (FileNotFoundException e ) {
            System.out.println(e.getMessage());
            System.out.println("Could not locate file location");
        }catch (IOException e) {
            System.out.println("Could not write file");
        }


    }
}