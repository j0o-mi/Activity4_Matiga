import java.util.Scanner;
import java.util.Random;

public class Activity4_Matiga {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int x = rd.nextInt(11);

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 0-10");

        System.out.print("\nEnter your Guess: ");
        int userGuess = sc.nextInt();

        while (userGuess != x) {
            System.out.println();
        }


        if (userGuess > x) {
            System.out.println("Too Low!");
        } else if (userGuess < x) {
            System.out.println("Too High!");
        } else if (userGuess == x) {
            System.out.println("You have guessed the value of x! " + x);
        } else {
            System.out.println("Invalid Guess");
        }
    }
}