import java.util.Scanner;

public class PowersTable {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int number = 0;
		int squared = 0;
		int cubed = 0;
		String answer = "y";

		do {
			System.out.println("Enter a number.");
			number = scnr.nextInt();
			for (int i = 1; i <= 1; i++) {
				System.out.println();
				System.out.printf("%-10s %-10s %-10s\n", "NUMBER", "SQUARED", "CUBED");
				System.out.printf("%-10s %-10s %-10s\n", "======", "=======", "======");
			}
			for (int i = 1; i <= number; i++) {
				squared = (int) Math.pow(i, 2);
				for (int j = 1; j <= number; j++) {
					cubed = (int) Math.pow(i, 3);
				}
				System.out.printf("%-10s %-10s %-10s\n", i, squared, cubed);
			}
			System.out.println();
			System.out.println("Wanna enter another number? (y/n)");
			answer = scnr.next();
			System.out.println();
		} while (answer.equalsIgnoreCase("y"));

	}

}