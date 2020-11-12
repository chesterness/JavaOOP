package assignment;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameRandom {
    public static void main(String[] args) {
        //Task2:
        //Create a guessing game, this time the number must not be hardcoded, but generated randomly:
        //1. User types a number 2. program prints out "correct" or "not correct" depending on the number entered
        //3. if the number is not correct, program promts the input again 4. go to 1.
        //Hints:
        //3.0. Use the solution from previous tasks.
        //3.1. Initialise the memorised value with the random function: Random rand = new Random(); int rand_int1 = rand.nextInt(1000);
        //3.2. Use while loop to repeat asking for a number.
        //3.3. Exit criteria would be a correct number.

        Scanner scnr = new Scanner(System.in);

        Random random = new Random();
        int randomRightNumber = random.nextInt(11);
        int read;
        System.out.println("Guess a number from 0 to 10! Input it below:");
        do {
            read = scnr.nextInt();
            if (read == randomRightNumber) {
                System.out.println("Correct! The number is " + randomRightNumber + "!");
            } else if (read < randomRightNumber) {
                System.out.println("The number that I'm thinking of is bigger");
            } else if (read > randomRightNumber) {
                System.out.println("The number that I'm thinking of is smaller");
            } else {
                System.out.println("Incorrect, try again");
            }
        } while (!(randomRightNumber == read));

    }
}
