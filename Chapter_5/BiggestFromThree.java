import java.util.Scanner;


public class BiggestFromThree {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input first number : ");
		double first = input.nextDouble();
		
		System.out.print("Input second number : ");
		double second = input.nextDouble();
		
		System.out.print("Input third number : ");
		double third = input.nextDouble();
		
		double biggestNumber;
		
		if(first > second && first > third){
			biggestNumber = first;
			
		}else if(second > third){
			biggestNumber = second;
			
		}else{
			biggestNumber = third;
		}
		
		System.out.println("The biggest number is: " + biggestNumber);
		
		

	}

}
