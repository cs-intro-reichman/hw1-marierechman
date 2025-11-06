// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int inputValue = Integer.parseInt(args[0]);
		int num1 = (int)(Math.random() * inputValue);
		int num2 = (int)(Math.random() * inputValue);
		int num3 = (int)(Math.random() * inputValue);
		System.out.println(num1 + " " + num2 + " " + num3);

		int min = Math.min(num1, Math.min(num2, num3));
		int max = Math.max(num1, Math.max(num2, num3));
		int medium = num1 + num2 + num3 - min - max;

		System.out.println(min + " " + medium + " " + max);

	}
}
