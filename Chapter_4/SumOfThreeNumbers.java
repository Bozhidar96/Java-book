import java.util.Scanner;


public class SumOfThreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		double first = input.nextDouble();
		System.out.print("Enter second number : ");
		double second = input.nextDouble();
		System.out.print("Enter third number : ");
		double third = input.nextDouble();
		
		System.out.printf("Sum of these number is : " + (first + second + third) );

	}

}
