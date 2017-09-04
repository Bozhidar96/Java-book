import java.util.Scanner;


public class CatalanNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = input.nextInt();
		
		double catalan;
		
		long n2Factorial = 1;
		long nFactorial = 1;
		long n1Factorial = 1;
		
		for (int i = 1; i <= 2 * n; i++) {
			n2Factorial *=i;
		}
		for (int i = 1; i <= n; i++) {
			nFactorial *= i;
		}
		
		n1Factorial = nFactorial * ( n + 1 );
		
		catalan = (double)n2Factorial / ((double)n1Factorial * (double)nFactorial);
		System.out.println(catalan);
		
	}

}
