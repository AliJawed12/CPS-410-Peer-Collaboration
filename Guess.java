import java.util.InputMismatchException;
import java.util.Scanner;

public class Guess {

    public static void main (String[] args) {

        System.out.println("Guess a number between 1 - 100");

        // Variables
        String tryAgain = "Y";
        int userVal = 0;
        int random = (int)(Math.random() * (100 - 1 + 1)) + 1;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter a value");
                userVal = scanner.nextInt();

                // if val not in range then restatr
                if (!(userVal >= 1 && userVal <= 100)) {
                    System.out.println("Guess must be between 1 - 100");
                    continue;
                }

                scanner.nextLine();


                // give user chance to try again until they get it right
                if (random == userVal) {
                    System.out.println("YOU GUESSED CORRECT!!!");
                    break;
                }
                else if (random > userVal) {
                    System.out.println("Guess is too low");
                }
                else if (random < userVal) {
                    System.out.println("Guess is too high");
                }


                System.out.println("Do you want to try again? (Y | N)");
                tryAgain = scanner.nextLine();
                tryAgain = tryAgain.toUpperCase();

            }
            catch (InputMismatchException e) {
                System.out.println("Enter a valid number");
                scanner.nextLine();
                continue;
            }
            catch (Exception e) {
                System.out.println("Unexpected Error Occured" + e.getMessage());
                scanner.nextLine();
            }


        }
        while (tryAgain.equals("Y"));

        System.out.println("Game Over");
        System.exit(0);

    }


    // Testable method for guess evalaution
    public static String guessCheck(int randomNum, int guess) {
        if (guess < 1 || guess > 100) return "Out of range";
        if (guess == randomNum) return "Correct";
        if (guess < randomNum) return "Too low";
        return "Too hihg";
    }

    // Testabel method for checking if user wants to continue
    public static boolean playAgainCheck(String input) {
        return input.equalsIgnoreCase("Y");
    }
}
