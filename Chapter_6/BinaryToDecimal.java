import java.util.Scanner;


public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String number;
		int dec = 0;
		number = input.nextLine();
		
		for (int i = number.length() - 1, j = 0; i >= 0; i--,j++) {
			
			if(number[i] == '1'){
				dec = dec | (1 << j);
				
			}
			
			System.out.println(dec);
		}
		
	}
}
