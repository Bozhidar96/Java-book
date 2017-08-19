import java.util.Scanner;


public class CheckLeftToRight_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int secondNumber = number / 100;
		int thirdNumber = secondNumber % 10;
		
		if(thirdNumber == 7){
			System.out.println("Yes!");
		}else{
			System.out.println("No!");
		}

	}

}
