import java.util.Scanner;


public class CircleCircumferenceAndArea {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input radius: ");
		double radius = input.nextDouble();
		
		double peremeter = Math.PI * 2 * radius;
		double area = Math.PI * radius * radius;
		
		System.out.print("Peremeter is : " + peremeter);
		System.out.print("Area is : " + area);
	}

}
