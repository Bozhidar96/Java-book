import java.util.Scanner;


public class QuadraticEquation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input parameter a,b,c : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double D = b * b - 4 * a * c;
		
		if(D < 0){
			System.out.println("Not real root!");
			
		}
		if(D == 0){
			double root = -b / 2 * a;
			System.out.println(root);
			
		}else{
			System.out.println((-b + Math.sqrt(D)) / (2 * a) + " " + (-b - Math.sqrt(D)) / (2 * a));
		}
	}

}
