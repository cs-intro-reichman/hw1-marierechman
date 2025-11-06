// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		double year = Double.parseDouble(args[2]);
		double powValue = Math.pow((1 + rate) , year);
		double futureValue = currentValue * powValue / 100 ;
		System.out.println("After " + (int)year + " years, $" + currentValue + " saved at " + 
		rate + "% will yield $" + (int)futureValue );
	}
}