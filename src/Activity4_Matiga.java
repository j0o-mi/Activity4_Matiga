import java.util.Scanner;
import java.util.Random;

public class Activity4_Matiga {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int secretNum = rd.nextInt(11);
        int userGuess = 0;
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 0-10");

        while (userGuess != secretNum) {
            System.out.print("\nEnter your Guess: ");
            userGuess = sc.nextInt();

            attempts++;

            if (userGuess == secretNum) {
                System.out.println("Congratulations! You have guessed it in " + attempts + " attempts.");
            } else if (userGuess > secretNum) {
                System.out.println("Too High! Try Again.");
            } else {
                System.out.println("Too Low! Try Again.");
            }
        }

        sc.close();
    }
}