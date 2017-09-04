import java.util.Scanner;


public class Sum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int x = input.nextInt();
		int i = 1;
		
		double sum = 1;
		double factorial = 1;
		double division = 1;
		
		do{
			factorial *= i;
			division = Math.pow(x, i);
			sum += factorial / division;
			i++;
		}while(i <= n);
		
		System.out.println(sum);
	}

}
