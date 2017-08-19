import java.util.Scanner;


public class Subsets {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		int firstNumber = input.nextInt();
		
		System.out.print("Input second number: ");
		int secondNumber = input.nextInt();
		
		System.out.print("Input third number: ");
		int thirdNumber = input.nextInt();
		
		if(firstNumber + secondNumber == 0){
			System.out.println("{1} + {2} = 0");
			
		}else if(firstNumber + thirdNumber == 0){
			System.out.println("{1} + {3} = 0");
			
		}else if(secondNumber + thirdNumber == 0){
			System.out.println("{2} + {3} = 0");
			
		}else{
			System.out.println("No subset found!");
		}

	}

}
