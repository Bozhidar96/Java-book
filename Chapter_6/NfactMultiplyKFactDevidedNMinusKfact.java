import java.util.Scanner;


public class NfactMultiplyKFactDevidedNMinusKfact {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		long nFact = 1;
		long kFact = 1;
		
		long n = input.nextInt();
		long k = input.nextInt();
		
		long differenceFact = 1;
		long difference = n - k;
		
		for (int i = 1; i <= n; i++){
            nFact *= i;
        }
        for (int i = 1; i <= k; i++){
            kFact *= i;
        }
        for (int i = 1; i <= difference; i++){
        	differenceFact *= i;
        }

		
		System.out.println(nFact * kFact / differenceFact);
	}

}
