import java.util.Scanner;


public class RangeTwoNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Input first number : ");
		int first = input.nextInt();
		System.out.print("Input second number : ");
		int last = input.nextInt();
		
		int counter = 0;
		for ( int i = first; i <= last; i++){
			if(i % 5 == 0){
				counter++;
				System.out.println("number is: " + i + " ");
			}
			
		}
		
		System.out.println("It a " + counter + " count!");
	}

}
