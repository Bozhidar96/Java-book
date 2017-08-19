import java.util.Scanner;


public class PositiveNegativeOrZero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input first number : ");
		double first = input.nextDouble();
		System.out.print("Input second number : ");
		double second = input.nextDouble();
		double decimal = second / first;
		
		if(decimal > 0){
			System.out.println("+");
			
		}else if(decimal < 0){
			System.out.println("-");
			
		}else{
			System.out.println("=");
		}
		

	}

}
