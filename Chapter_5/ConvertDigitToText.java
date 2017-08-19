import java.util.Scanner;


public class ConvertDigitToText {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number: ");
		int param = input.nextInt();
		
		if(param >= 0 && param <= 999){
			int temp = param;
			switch(temp / 100){
				case 0: break;
				case 1: System.out.print("One hundred ");break;
				case 2: System.out.print("Two hundred ");break;
				case 3: System.out.print("Three hundred ");break;
				case 4: System.out.print("Four hundred ");break;
				case 5: System.out.print("Five hundred ");break;
				case 6: System.out.print("Six hundred ");break;
				case 7: System.out.print("Seven hundred ");break;
				case 8: System.out.print("Eight hundred ");break;
				case 9: System.out.print("Nine hundred ");break;
				default: System.out.print("Error input!");
			}
			
			if(temp / 100 != 0 && temp % 100 != 0){
				System.out.print("and");
			}
			
			switch(temp / 10 % 10){
				case 0: break;
				case 1:{
					switch(temp % 10){
						case 0:System.out.print(" ten ");break;
						case 1:System.out.print(" eleven ");break;
						case 2:System.out.print(" twelve ");break;
						case 3:System.out.print(" thirteen ");break;
						case 4:System.out.print(" fourteen ");break;
						case 5:System.out.print(" fifteen ");break;
						case 6:System.out.print(" sixteen ");break;
						case 7:System.out.print(" seventeen ");break;
						case 8:System.out.print(" eighteen ");break;
						case 9:System.out.print(" ninteen ");break;
						default:System.out.print("Error input!");break;
						}
					}
				case 2:System.out.print(" twenty ");break;
				case 3:System.out.print(" thirty ");break;
				case 4:System.out.print(" fourty ");break;
				case 5:System.out.print(" fifty ");break;
				case 6:System.out.print(" sixty ");break;
				case 7:System.out.print(" seventy ");break;
				case 8:System.out.print(" eighty ");break;
				case 9:System.out.print(" ninty ");break;
				default:System.out.print("Error input!");break;
				}
			
			switch(temp % 10){
				case 0:
					if(temp == 0){
						System.out.print(" zero ");
					}
					System.out.println();
					break;
				case 1:
					if(temp / 10 % 10 == 1) break;
					System.out.print(" one ");
					break;
				case 2:
					if(temp / 10 % 10 == 1) break;
					System.out.print(" two ");
					break;
				case 3:
					if(temp / 10 % 10 == 1) break;
					System.out.print(" three ");
					break;
				case 4:
					if(temp / 10 % 10 == 1) break;
					System.out.print(" four ");
					break;
				case 5:
					if(temp / 10 % 10 == 1) break;
					System.out.print(" five ");
					break;
				case 6:
					if(temp / 10 % 10 == 1) break;
					System.out.print(" six ");
					break;
				case 7:
					if(temp / 10 % 10 == 1) break;
					System.out.print(" seven ");
					break;
				case 8:
					if(temp / 10 % 10 == 1) break;
					System.out.print(" eight ");
					break;
				case 9:
					if(temp / 10 % 10 == 1) break;
					System.out.print(" nine ");
					break;
				default: System.out.println("Error input!");break;
			}
			
		}else{
			System.out.println(" Out of range !");
		}

	}

}
