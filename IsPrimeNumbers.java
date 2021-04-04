package JavaProjects;

import java.util.Scanner;

public class IsPrimeNumbers {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int number=scan.nextInt();
		isPrimeNumber(number);
		for (int n = 2; n <= number; n++) {
			if (isPrimeNumber(n)) {
				System.out.print(n + " ");
			}
		}
	}

	public static boolean isPrimeNumber(int number) {
		for (int i = 2; i < number; i++) {
			if ((number % i) == 0) {
				return false;
			}
		}
		return true;
	}
}