package studentCode;
import java.util.Scanner;


public class CryptoQuiz {
	//NOTE: You MUST use these named constants.  The submit server will
	//      fail you on the Task 4 tests if you do not use these named
	//      constants in your code but rather use the actual values.
	static int NUM_BITS1 = 80, NUM_BITS2 = 128, NUM_BITS3 = 168;
	static String CRYPT1 = "Skipjack", CRYPT2 = "Rijndael", CRYPT3 = "TripleDES";



	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);


		//YOUR CODE IN HERE
		System.out.print("Enter 1 to guess a cryptographic system, 2 to guess how many BITs: ");
		int rita  = myScanner.nextInt();
		//YOUR CODE IN HERE		

		if (rita == 1 ) {
			System.out.print("Choose number of BITs: ");

			int mita = myScanner.nextInt();
			if (mita == NUM_BITS1 || mita == NUM_BITS2 || mita == NUM_BITS3 ) {
				System.out.print("Which cryptographic system uses " +mita+ " BITs? ");

				String sita = myScanner.next();
				if (sita.equals(CRYPT1) && mita==NUM_BITS1) {
					System.out.println("Correct!");
				} else if (sita.equals(CRYPT2) &&  mita==NUM_BITS2) {
					System.out.println("Correct!");

				} else if (sita.equals(CRYPT3) && mita==NUM_BITS3) {
					System.out.println("Correct!");
				} else {
					System.out.println("Incorrect!");
				}
			} else {
				System.out.println("Invalid choice.");
			}
		} 
		else if (rita == 2) {

			System.out.print("Choose a cryptographic system: ");

			String pita = myScanner.next();
			if (pita.equals(CRYPT1) || pita.equals(CRYPT2) || pita.equals(CRYPT3) ) {
				System.out.print("How many BITs used in a " +pita+ " system? ");

				int bita = myScanner.nextInt();
				if (pita.equals(CRYPT1) && bita==NUM_BITS1) {
					System.out.println("Correct!");
				} else if (pita.equals(CRYPT2) && bita==NUM_BITS2) {
					System.out.println("Correct!");

				} else if (pita.equals(CRYPT3) && bita==NUM_BITS3) {
					System.out.println("Correct!");
				} else {
					System.out.println("Incorrect!");
				}
			} else {
				System.out.println("Invalid choice.");
			} 
		}

		myScanner.close();
	}
}
