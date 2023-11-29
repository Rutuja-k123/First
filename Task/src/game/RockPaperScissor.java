package game;

import java.util.Scanner;

public class RockPaperScissor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Player1;
		String Player2;
		System.out.println("Enter player1 name:");
		Player1 = sc.next();
		System.out.println(Player1);
		System.out.println("Enter Player2 name:");
		Player2 = sc.next();
		System.out.println(Player2);
		String choice1, choice2;
		System.out.println("Enter" + " " + Player1 + " " + "choice rock,paper,scissors or stop:");
		choice1 = sc.next();
		System.out.println("Enter" + " " + Player2 + " " + " choice rock,paper,scissors or stop:");
		choice2 = sc.next();
		if (choice1.equals(choice2)) {
			System.out.println("Its tie...Play again");
		} else if (choice1.equals("rock")) {
			if (choice2.equals("paper")) {
				System.out.println(Player2 + " " + "wins");
			} else {
				System.out.println(Player1 + " " + "wins");
			}
		} else if (choice1.equals("rock")) {
			if (choice2.equals("scissors")) {
				System.out.println(Player1 + " " + "wins");
			} else {
				System.out.println(Player2 + " " + "wins");
			}
		} else if (choice1.equals("paper")) {
			if (choice2.equals("scissors")) {
				System.out.println(Player2 + " " + "wins");
			} else {
				System.out.println(Player1 + " " + "wins");
			}
		} else if (choice1.equals("stop")) {
			System.out.println(Player1 + " " + " decided to stop");
			
		}
		if (choice2.equals("stop")) {
			System.out.println(Player2 + " " + "decided to stop");
			
		}
	}
}
