package readFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class usage {
    public static void main(String[] args) {
        // how to read a file using java (3 popular options)

        // BufferedReader + FileReader: best for reading text file line by line
        // FileInputStream: best for binary files (eg: images, audio files)
        // RandomAccessFile: best for read/write specific portions of large file

        String filepath = "E:\\javaBroCode\\src\\readFile\\test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch(FileNotFoundException e){
            System.out.println("could not locate file");
        } catch (IOException e) {
            System.out.println("something went wrong");
        }
    }
}
