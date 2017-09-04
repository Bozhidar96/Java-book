import java.util.Scanner;


public class MinAndMaxFromASequenceOfNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n = ");
		int n = input.nextInt();
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++) {
			
			int integer = input.nextInt();
			if(integer > maxValue){
				maxValue = integer;
			}
			if(integer < minValue){
				minValue = integer;
			}
			
		}
		
		System.out.println("Min value is: " + minValue);
		System.out.println("Max value is: " + maxValue);
		
		
	}

}
