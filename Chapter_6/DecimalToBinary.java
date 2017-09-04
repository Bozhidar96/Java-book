import java.util.Scanner;


public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int[] bigNumber = new int[8];
		int digits;
		
		for (int i = 0; i < 8; i++) {
			
			if((digits = number & 1 << i) != 0){
				bigNumber[i] = 1;
				
			}
		}
		
		for (int j = bigNumber.length - 1; j >= 0; j--) {
			
			System.out.print(bigNumber[j]);
		}
		System.out.println();
		
		

	}

}
