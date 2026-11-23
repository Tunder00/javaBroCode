package writeFile;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class usage {
    public static void main(String[] args) {
        // how to write a file using java (4 popular options)

        // FileWriter = good for small or medium-sized text files
        // BufferWriter = better performance for large amounts of text
        // PrintWriter = best for structured data, like reports or logs
        // FileOutputStream = best for binary files (eg: images, audio files)

        String filePath = "E:\\javaBroCode\\src\\writeFile\\test.txt"; // \ this slash will be treated as escape character
        String textContent = "hello i am a good boy \n i am playing pubg\n you can call me";
        String textContent1 = """
                Roses are red
                Voilets are blue
                are you gululu
                """;
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("hello i am a good boy \n i am playing pubg");
            writer.write(textContent);
            writer.write(textContent1);
            System.out.println("file has been written");
        }catch (FileNotFoundException e){
            // eg misspelt path "E:\\javaBroCod\\src\\writeFile\\test.txt" instead of "E:\\javaBroCode\\src\\writeFile\\test.txt"
            System.out.println("could not locate file location");
        } catch(IOException e) {
            System.out.println("could not write file");
        }
    }
}
