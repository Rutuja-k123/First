package password;

import java.util.Random;

public class GeneratePass {
	public static void main(String[] args) {

		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String specialchar = "<>@!$#%&*=;";
		String number = "012456789";
		System.out.println("Generate Password:");
		String combination = upper + lower + specialchar + number;
		int len = 8;
		char[] pass = new char[len];
		Random r = new Random();
		for (int i = 0; i < len; i++) {
			pass[i] = combination.charAt(r.nextInt(combination.length()));

		}
		System.out.println(pass);

	}

}
