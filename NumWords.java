// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int inputValue =  Integer.parseInt(args[0]);
		int hundres = inputValue / 100 ;
		int remainder = inputValue % 100 ;
		int tens = remainder / 10 ; 
		int ones = remainder % 10 ; 
		System.out.println(hundres + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
