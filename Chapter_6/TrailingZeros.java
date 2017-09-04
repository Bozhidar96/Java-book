import java.util.Scanner;


public class TrailingZeros {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int counter = 0;
		long nFactoriel = 1;
		
		for (int i = 1; i <= number; i++) {
			
			if(i % 5 == 0){
				counter++;
				
			}
			nFactoriel *= i;
			
			System.out.println("N = " + number + " ");
			System.out.print("N! = " + nFactoriel + " -> " + counter + " ");
		}
		
	}

}
