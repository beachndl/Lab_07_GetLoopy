import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        // Scanner + random number gen
        Scanner in = new Scanner(System.in);
        Random gen = new Random();

        // Variable declaration
        String playAgain;
        int count, die1, die2, die3, sum;
        boolean triple;

        // Main loop
        do {
            // Print the header section
            System.out.println("------------------------------------");
            System.out.println("Roll    Die1    Die2    Die3    Sum");
            System.out.println("------------------------------------");

            // Variables for loop
            triple = false;
            count = 0;

            // Roll until triple is found
            while (!triple) {
                count++;

                // Generate 3 random die values
                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;

                // Calculate the sum
                sum = die1 + die2 + die3;

                // Print results
                System.out.printf(" %-4d    %-4d    %-4d    %-4d    %-4d%n", count, die1, die2, die3, sum);

                // Check triple condition
                if (die1 == die2 && die2 == die3) {
                    triple = true;
                }
            }

            // Ask to play again
            do {
                System.out.println("------------------------------------");
                System.out.print("Do you want to play again? (y/n): ");
                playAgain = in.nextLine();

                // Check to validate input
                if (!playAgain.equalsIgnoreCase("y") && !playAgain.equalsIgnoreCase("n")) {
                    System.out.println("Invalid choice, please enter 'y' or 'n'.");
                }
            } while (!playAgain.equalsIgnoreCase("y") && !playAgain.equalsIgnoreCase("n"));

        } while (playAgain.equalsIgnoreCase("y"));
    }
}