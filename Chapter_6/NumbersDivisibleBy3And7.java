import java.util.Scanner;


public class NumbersDivisibleBy3And7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n = ");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			if(!(i % 3 == 0 && i % 7 == 0)){
				System.out.print(i + " ");
			}
		}
	}

}
