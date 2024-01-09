package task_9;

public class Qus3 {

	public static void main(String[] args) {

		int n = 4;
		int r, c;
		int num = 1;
		
		System.out.println("The Value will be : ");
		
		for (r = 1; r <= n; r++) {
			for (c = 1; c <= r; c++) {
				System.out.print(num + " ");

				num++;

			}
			System.out.println();

		}
	}
}

/*
 * Out put:
 * 
 * 1 
 * 2 3 
 * 4 5 6 
 * 7 8 9 10
 * 
 */
