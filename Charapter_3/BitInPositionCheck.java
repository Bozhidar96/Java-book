import java.util.Scanner;


public class BitInPositionCheck {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number : ");
		int inputNumber = input.nextInt();
		System.out.print("Input position : ");
		int inputPosition = input.nextInt();
		
		System.out.println(0 != (inputNumber & (1 << inputPosition)));
	}

}
