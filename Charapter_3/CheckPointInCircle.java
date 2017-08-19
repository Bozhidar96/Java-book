import java.util.Scanner;


public class CheckPointInCircle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x: ");
		double x = input.nextInt();
		System.out.print("Enter y: ");
		double y = input.nextInt();
		double point = (x*x) + (y*y);
		
		if(point < 5){
			System.out.println("Is in!");
		}else{
			System.out.println("No!");
		}
		
	}

}
