package hangmangame;

import java.util.ArrayList;
import java.util.Scanner;

public class usage {
    public static void main(String[] args) {
        // java hangman game

        String word = "pizza";

        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i =0; i < word.length(); i++){
            wordState.add('_');
        }

        // System.out.println(wordState);

        System.out.println("**********");
        System.out.println("welcome to java hangman.");
        System.out.println("**********");

        //System.out.println(getHangmanArt(0));
        //System.out.println(getHangmanArt(1));
        //System.out.println(getHangmanArt(2));
        //System.out.println(getHangmanArt(3));
        //System.out.println(getHangmanArt(4));
        //System.out.println(getHangmanArt(5));
        //System.out.println(getHangmanArt(6));
        //System.out.println(getHangmanArt(7));

        while(wrongGuesses < 6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.print("word: ");

            for (char c : wordState){
                System.out.print(c+ " ");
            }

            System.out.println();

            System.out.print("guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("correct guess");
                for(int i=0; i< word.length(); i++){
                    if (word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }
                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("you win");
                    System.out.println("the word was: "+word);
                    break;
                }
            } else {
                wrongGuesses++;
                System.out.println("wrong guess");
            }
        }

        if(wrongGuesses >= 6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("game over");
            System.out.println("the word was: "+word);
        }
        scanner.close();
    }
    static String getHangmanArt(int wrongGuesses){
        return switch(wrongGuesses){
            case 0 -> """
                    
                    
                    
                    
                    """;
            case 1 -> """
                      o
                    
                 
                    """;
            case 2 -> """
                      o
                      |
                    
                    """;
            case 3 -> """
                      o
                     /|
                    
                    """;
            case 4 -> """
                      o
                     /|\\
                    
                    """;
            case 5 -> """
                      o
                     /|\\
                     /
                    """;
            case 6 -> """
                      o
                     /|\\
                     / \\
                    """;
            default -> "";
        };
    }
}
