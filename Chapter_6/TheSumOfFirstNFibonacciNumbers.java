import java.util.Scanner;


public class TheSumOfFirstNFibonacciNumbers {
	
	 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter numbers : ");
		int numbers = input.nextInt();
		
		int firstNumber = 0;
		int secondNumber = 1;
		int thirdNumber;
		
		System.out.print(firstNumber + " " + secondNumber);
		
		for (int i = 2; i < numbers; ++i) {
			
			thirdNumber = firstNumber + secondNumber;
			
			System.out.print(" " + thirdNumber);
			
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}
		
		
		  
		  
		  
		

	}

}
