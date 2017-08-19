import java.util.Scanner;


public class BonusSystem {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input digits: ");
		int digits = input.nextInt();
		
		switch(digits){
			case 1:
			case 2:
			case 3: 
				digits *= 10;
				System.out.println("Digits is: " + digits);
				break;
			case 4:
			case 5:
			case 6:
				digits *=100;
				System.out.println("Digits is: " + digits);
				break;
			case 7:
			case 8:
			case 9:
				digits *=1000;
				System.out.println("Digits is: " + digits);
				break;
			default: System.out.println("Bad input!");
				
		}
	}

}
