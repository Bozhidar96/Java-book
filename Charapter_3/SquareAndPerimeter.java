import java.util.Scanner;


public class SquareAndPerimeter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter height : ");
		double height = input.nextDouble();
		System.out.print("Enter weight : ");
		double weight = input.nextDouble();
		double square = height * weight;
		double peremeter = ( 2 * height ) + ( 2 * weight );
		
		System.out.println("Square: " + square);
		System.out.println("Peremeter: " + peremeter);

	}

}
