import java.util.Scanner;


public class BiggerNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		int a = input.nextInt();
		
		System.out.print("Input second number: ");
		int b = input.nextInt();
		
		int bigger = ((a + b) + Math.abs(a - b) ) / 2;
		System.out.println("The bigger is: " + bigger );
		

	}

}
