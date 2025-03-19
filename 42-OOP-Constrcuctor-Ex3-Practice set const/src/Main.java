import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Game started!");
        Game g = new Game();

        System.out.println("Alert! You have only 5 chances.");
        int attempts = g.getNo_of_guesses();

        while (attempts > 0) {
            int guess = g.user_input();
            if (g.condition(guess)) {
                break; // Exit loop if user guesses correctly
            }
            attempts--;
            if (attempts > 0) {
                System.out.println("You have " + attempts + " attempts left.");
            } else {
                System.out.println("Game Over! The correct number was: " + g.number);
            }
        }
    }
}
