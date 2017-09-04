import java.util.Scanner;


public class Matrix {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter positive real number: ");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 1; j <= n; j++) {
				
				System.out.print((i + j) + " ");
			}
			System.out.println();
		}

	}

}
