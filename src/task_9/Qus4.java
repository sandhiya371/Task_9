package task_9;

public class Qus4 {

	public static void main(String[] args) {

		int n = 5;
		int r, c;
		
		System.out.println("The Value will be : ");
		
		for (r = 0; r < n; r++) {
			for (c = 0; c < n; c++) {

				if (r == c || r + c == n - 1) {

					System.out.print("*");

				} else {

					System.out.print(" ");

				}

			}
			System.out.println();

		}

	}

}


/*
 * Output:




*   *
 * * 
  *  
 * * 
*   *
 
 
 
 
 
 */