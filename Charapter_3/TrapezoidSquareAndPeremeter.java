import java.util.Scanner;


public class TrapezoidSquareAndPeremeter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter base1 : ");
		double base1 = input.nextDouble();
		System.out.print("Enter base2 : ");
		double base2 = input.nextDouble();
		System.out.print("Enter height : ");
		double height = input.nextDouble();
		
		double area = 0.5 * (((base1 + base2) * height) / 2 );
		
		System.out.println("Area is : " + area);
		
	}

}
