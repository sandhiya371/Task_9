package task_9;

import java.util.Scanner;

public class Qus6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Value : ");
		
		int month = scanner.nextInt();

		double roomRent = scanner.nextDouble();

		int daysStayed = scanner.nextInt();

		double totalCost;
		switch (month) {
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			totalCost = roomRent * 1.2 * daysStayed;
			break;
		default:
			totalCost = roomRent * daysStayed;
		}

		System.out.printf("%.2f\n", totalCost);

	}

}

/*
 
Output:
 
Enter the Value : 
3
1500
2
3000.00 
 
*/





