import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Input number from 0 to 100: ");
		int number = input.nextInt();
		
		if(number == 2 || number == 3 || number == 5 || number == 7){
			
			System.out.println("It is prime!");
			
		}else if (((number % 2) != 0) && ((number % 3) != 0) && ((number % 5) != 0) 
				&& ((number % 7) != 0)){
			System.out.println("It is prime!");
			
		}else{
			System.out.println("Not prime!");
		}
	}

}
