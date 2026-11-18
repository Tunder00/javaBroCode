import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {
        // java quiz game

        Scanner scanner = new Scanner(System.in);
        // Questions array[]
        String[] questions = {"What is the main function of a router",
                                "which part of computer is called brain",
                                "which year was facebook launched",
                                "who is known as father of computer",
                                "what is 1st programming language"};
        // options [][]
        String[][] options ={
                {"1. Storing files","2. encrypting data","3. directing internet traffic","4. managing passwords"},
                {"1. CPU","2. HDD","3. RAM","4. GPU"},
                {"1. 2000","2. 2004","3. 2006","4. 2008"},
                {"1. Steve jobs","2. bill gates","3. alan turing","4. charles babbage"},
                {"1. COBOL","2. C","3. fortran","4. Assembly"}
        };

        // declare variables
        int[] answers = {3,1,2,4,3};
        int score = 0;
        int guess;


        // welcome message
        System.out.println("********");
        System.out.println("welcome to java quiz game");
        System.out.println("********");
        // question loop
        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i]);
            // options
            for(String option : options[i]){
                System.out.println(option);
            }
            // get guess from user
            System.out.print("enter your guess: ");
            guess = scanner.nextInt();
            // check our guess
            if(guess == answers[i]){
                System.out.println("*****");
                System.out.println("Correct");
                System.out.println("*****");
                score += 1;
            }
            else {
                System.out.println("*****");
                System.out.println("Correct");
                System.out.println("*****");
            }
        }
        // display final score
        System.out.println("your final score is: "+score+ " out of "+questions.length);

        scanner.close();
    }
}
