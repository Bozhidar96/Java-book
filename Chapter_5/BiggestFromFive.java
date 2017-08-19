import java.util.Scanner;


public class BiggestFromFive {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		double firstNumber = input.nextDouble();
		
		System.out.print("Input second number: ");
		double secondNumber = input.nextDouble();
		
		System.out.print("Input third number: ");
		double thirdNumber= input.nextDouble();
		
		System.out.print("Input fourth number: ");
		double fourthNumber = input.nextDouble();
		
		System.out.print("Input fifth number: ");
		double fifthNumber = input.nextDouble();
		
		double max1 = Math.max(firstNumber, secondNumber);
		double max2 = Math.max(fifthNumber, fourthNumber);
		
		max1 = Math.max(max1, thirdNumber);
		max1 = Math.max(max1, max2);
		
		System.out.println("The max number is : " + max1);

	}

}
