import java.util.Scanner;


public class DigitsStirrer {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int abcd = input.nextInt();
		
		int a = abcd/1000;
		int b = (abcd % 1000) / 100;
		int c = (abcd % 100) / 10;
		int d = abcd % 10;
		
	
		System.out.println(a + b + c + d);
		System.out.println(d * 1000 + c * 100 + b * 10 + a);
		System.out.println(d * 1000 + a * 100 + b * 10 + c);
		System.out.println(a * 1000 + c * 100 + b * 10 + d);
	
	}

}
