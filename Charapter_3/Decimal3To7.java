import java.util.Scanner;


public class Decimal3To7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean check = false;
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		if(number % 5 == 0 && number % 7 == 0){
			check = true;
			System.out.println(check);
		}else{
			System.out.println(check);
		}
	}

}
