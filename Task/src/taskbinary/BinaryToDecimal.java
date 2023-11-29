package taskbinary;

import java.util.Scanner;
import java.lang.Math;

public class BinaryToDecimal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary no:");
		int binary = sc.nextInt();
		int decimal=Binary.bintodeci(binary);
		System.out.println("Decimal of given binary is:"+" "+decimal);
		sc.close();
	}
}

class Binary {

	public static int bintodeci(int binary) {
		int decimal = 0;
		int power = 0;
		while (binary != 0) {
			int rem = binary % 10;
			decimal =  (int) (decimal + rem * (Math.pow(2, power)));
			power++;
			binary = binary / 10;
		}
		return decimal;
	}
}