import java.util.Random;
import java.util.Scanner;


public class From1toNrandomly {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = input.nextInt();
		boolean[] printed = new boolean[number + 1];
		Random randNumber = new Random();
		int numberToPoint;
		
		for (int i = 1; i <= number; i++) {
			
			if(!printed[numberToPoint]){
				System.out.println(numberToPoint);
				printed[numberToPoint] = true;
				continue;
			}
		}
	}

}
