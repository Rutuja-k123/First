package task2;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int number = r.nextInt(101);
		int guess;
		int numguesses = 0;

		System.out.println("Welcome to the Number Guessing....");
		System.out.println("I have a number between 1 to 100...");
		System.out.println("Let's start the guess...");
		do {
			System.out.println("Enter your guess:");
			guess = sc.nextInt();
			numguesses++;
			if (numguesses >= 10) {
				System.out.println("You reached the guess limit...");
				break;
			}
			if (guess < number) {
				System.out.println("Think Higher number...");
			}
			if (guess > number) {
				System.out.println("Think Lower number...");
			}
			if (guess == number) {
				System.out.println("Great!!!! YOU got the Number..." + "in" + " " + numguesses + " " + "Guesses" + " "
						+ "& the Number is" + " " + number + ".");
			}

		} while (guess != number);
		sc.close();

	}

}
