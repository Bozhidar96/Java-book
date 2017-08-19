import java.util.Scanner;


public class BiggestNumberOf5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input numbers: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		
		if(a > b && a > c && a > d && a > e){
			System.out.println("The bigest is: " + a);
			
		}else if(b > c && b > d && b > e){
			System.out.println("The bigest is: " + b );
			
		}else if(c > d && c > d){
			System.out.println("The bigest is: " + c );
			
		}else if(d > e){
			System.out.println("The bigest is: " + d );
			
		}else{
			System.out.println("The bigest is: " + e );
			
		}

	}

}
