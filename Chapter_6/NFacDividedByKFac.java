import java.util.Scanner;


public class NFacDividedByKFac {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter N!: ");
		long nFact = input.nextLong();
		System.out.print("Enter K!: ");
		long kFact = input.nextLong();
		
		long factorial = 1;
		
		if(nFact > kFact){
			for (long j = kFact + 1; j <= nFact; j++) {
				
				factorial *=j;
			}
			System.out.println(factorial);
		}
			
		else{
				
				for (long j = nFact + 1; j <= kFact; j++) {
					factorial *= j;
				}
				System.out.println(1/factorial);
			}
				
		
	}

}
