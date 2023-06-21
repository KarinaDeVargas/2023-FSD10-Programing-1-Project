package FinalProject;

import java.util.Scanner;

public class Question01 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		//Retrieving data from user
		System.out.println("Enter 3 2-digit numbers:");
		int n1 = kb.nextInt();
		int n2 = kb.nextInt();
		int n3 = kb.nextInt();
		int sum = n1 + n2 + n3;
		int magicNumber;

		kb.close();

		System.out.println();

		if (sum % 3 == 0 && sum % 5 != 0) {
			magicNumber = firstDigit(n2) * 100 + (n1 + n3);
		}
		else if (sum % 3 != 0 && sum % 5 == 0) {
			magicNumber = (n1 + n3) * 10 + lastDigit(n2);
		}
		else if (sum % 3 == 0 && sum % 5 == 0) {
			magicNumber = (n2 * 1000) + (n1 * 10) + 1;
		} else {
			magicNumber = (n1 * 10000) + (n2 * 100) + n3;
		}

		System.out.println("Your magic number is " + magicNumber);

	}

	public static int firstDigit(int n) {
		while (n >= 10)
			n /= 10;
		return (n);
	}

	public static int lastDigit(int n) {
		return (n % 10);
	}

}
