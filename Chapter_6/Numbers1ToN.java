import java.util.Scanner;


public class Numbers1ToN {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n = ");
		int number = input.nextInt();
		
		for (int i = 0; i < number; i++) {
			System.out.println(number);
		}

	}

}
