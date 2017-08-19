import java.util.Scanner;


public class InCircleOutRectangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double pointX = input.nextDouble();
		double pointY = input.nextDouble();
		
		double radius = 5.00;
		boolean isInTheCircle = false;
		
		if((radius * radius) >= ((pointX * pointY) + (pointY * pointY)));{
			isInTheCircle = true;
		}
		
		int rectBotLeftX = -1;
		int rectBotLeftY = 1;
		int rectBotRightX = 5;
		int rectBotRightY = 5;
		
		boolean isOutOfTheCircle = false;
		if((rectBotLeftX > pointX) || (rectBotRightX < pointX)
				|| (rectBotLeftY > pointY) || (rectBotRightY < pointY)) {
			isOutOfTheCircle = true;
			
		}
		
		System.out.println(isInTheCircle && isOutOfTheCircle);

	}

}
