import java.util.Scanner;


public class EarthAndMoon {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter gravity Earth : ");
		double earth = input.nextDouble();
		double moon = (earth * 17)/100;
		
		System.out.println("Human in the moon is : " + moon + "KG");
		
	}

}
