package musicPlayer;
import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class usage {
    public static void main(String[] args) {
        // how to play audio with java (.wav, .au, .aiff) [mp3 you may need external source]

        String filepath = "src\\musicPlayer\\putmalli_wav.wav"; // relative file path as it is in the same folder

        File file = new File(filepath);

        try (Scanner scanner = new Scanner(System.in); AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){ // try with resources will close the file automatically


            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";
            while (!response.equals("Q")){
                System.out.println("P = play");
                System.out.println("S = Stop");
                System.out.println("R = reset");
                System.out.println("Q = quit");

                System.out.print("enter your choice: ");
                response = scanner.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("invalid choice");
                }
            }
        } catch(FileNotFoundException e){
            System.out.println("file not found");
        } catch(UnsupportedAudioFileException e){
            System.out.println("audio file is not suppoted");
        } catch(LineUnavailableException e){
            System.out.println("unable to access audio resource");
        } catch (IOException e) {
            System.out.println("something went wrong");
        } finally {
            System.out.println("Bye!");
            //scanner.close();
        }
    }
}
