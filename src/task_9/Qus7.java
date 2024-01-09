package task_9;

import java.util.Scanner;

public class Qus7 {

	public static void main(String[] args) {

		int a, b, c, largest, temp;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number:");

		a = sc.nextInt();

		System.out.println("Enter the second number:");

		b = sc.nextInt();

		System.out.println("Enter the third number:");

		c = sc.nextInt();

		temp = a > b ? a : b;

		largest = c > temp ? c : temp;

		System.out.println("The largest number is: " + largest);

	}

}


/*
 * Output:
 * 
 * Enter the first number: 10 
 * Enter the second number: 3 
 * Enter the third number: 1 
 * The largest number is: 10
 * 
 */