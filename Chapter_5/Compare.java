import java.util.Scanner;


public class Compare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first = input.nextInt();
		System.out.print("Enter second number: ");
		int second = input.nextInt();
		
		if(first > second){
			int comparator = first;
			first = second;
			second = comparator;
		}
		System.out.println("first: " + first + " ,second: " + second);

	}

}
