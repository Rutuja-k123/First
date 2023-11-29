package task;

import java.util.Scanner;

class TicTacToe {
	static char[][] board = new char[3][3];

	TicTacToe() {
		board = new char[3][3];
		createboard();
	}

	void createboard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = ' ';
			}
		}
	}

	void showboard() {
		System.out.println("-------------");
		for (int i = 0; i < board.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	static void placemark(int r, int c, char mark) {
		if (r >= 0 && r <= 2 && c >= 0 && c <= 2) {
			board[r][c] = mark;
		}
	}

	static boolean checkroweql() {
		for (int i = 0; i <= 2; i++) {
			if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return true;
			}
		}
		return false;
	}

	static boolean checkcoleql() {
		for (int j = 0; j <= 2; j++) {
			if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
				return true;
			}
		}
		return false;
	}

	static boolean diaeql() {
		if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]
				|| board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
			return true;
		}
		return false;
	}

	static boolean isdraw() {
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}
}

class Player {
	String name;
	char mark;

	public Player(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}

	public void dispname() {
		System.out.println(name + mark);
	}

	void makemmark() {
		Scanner sc = new Scanner(System.in);
		int r, c;
		do {
			System.out.println("Enter row and column:");
			r = sc.nextInt();
			c = sc.nextInt();
		} while (!valid(r, c));
		TicTacToe.placemark(r, c, mark);
	}

	boolean valid(int r, int c) {
		if (r >= 0 && r <= 2 && c >= 0 && c <= 2) {
			if (TicTacToe.board[r][c] == ' ') {
				return true;
			}
		}
		return false;
	}
}

public class PlayTicTacToe {
	public static void main(String[] args) {
		TicTacToe tt = new TicTacToe();
		tt.createboard();
		tt.showboard();
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 1 name and choose mark:");
		String name1 = sc.next();
		char mark1 = sc.next().charAt(0);
		Player p1 = new Player(name1, mark1);
		System.out.println("Player 1 is" + " " + p1.name + " " + p1.mark);
		System.out.println("Player 2 name and choose mark:");
		String name2 = sc.next();
		char mark2 = sc.next().charAt(0);
		Player p2 = new Player(name2, mark2);
		System.out.println("Player 2 is " + " " + p2.name + " " + p2.mark);
		Player cp;
		cp = p1;
		while (true) {
			System.out.println(cp.name +" "+ "turn");
			cp.makemmark();
			tt.showboard();
			if (TicTacToe.checkroweql() || TicTacToe.checkcoleql() || TicTacToe.diaeql()) {
				System.out.println("Congratulations!!!" + " " + cp.name + " " + "Won");
				break;
			} else if (TicTacToe.isdraw()) {
				System.out.println("OHHHHH It's Draw!!");
				break;
			} else {
				if (cp == p1) {
					cp = p2;
				} else {
					cp = p1;
				}
			}

		}
	}
}