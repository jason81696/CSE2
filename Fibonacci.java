import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in); // make a scanner to read input
		int fib1, fib2, fib3, n; // create the variables I'll be getting from the users
		System.out.print("Enter the first number in the sequence: ");
		fib1 = readInt(myScanner); // read an integer from the user for the first fibonacci sequence number
		System.out.print("Enter the second number in the sequence: ");
		fib2 = readInt(myScanner); // read an integer from the user for the second fibonacci sequence number
		System.out.print("How many custom Fibonacci numbers should be printed? ");
		n = readInt(myScanner); // read the number of values we'll be printing
		System.out.println();
		System.out.print(fib1 + "," + fib2 + ","); // print fib1 and fib2
		for (int i=0;i<n-2;i++) {
			fib3 = fib1 + fib2; // calculate the next value in the sequence
			if (i != n-3) { // if it's not the last number we're printing, print a comma
				System.out.print(fib3 + ",");
			} else { // if it is, don't print comma
				System.out.println(fib3);
			}
			// prepare the next values of the fibonacci sequence
			fib1 = fib2;
			fib2 = fib3;
		}
	}

	private static int readInt(Scanner scanner) {
		String userData = "";
		boolean isValid = true;
		boolean readInputAgain = true;
		while (readInputAgain) {
			userData = scanner.nextLine();
			readInputAgain = false;
			isValid = true;
			for (int i=0;i<userData.length();i++) {
				if (userData.charAt(i)!='0' && userData.charAt(i)!='1'&&userData.charAt(i)!='2'&&userData.charAt(i)!='3'&&userData.charAt(i)!='4'&&userData.charAt(i)!='5'&&userData.charAt(i)!='6'&&userData.charAt(i)!='7'&&userData.charAt(i)!='8'&&userData.charAt(i)!='9') {
					isValid = false;
					break;
				}
			}
			if (!isValid) {
				System.out.print("Invalid data.  Please enter an integer: ");
				readInputAgain = true;
			}
		}
		return Integer.parseInt(userData); //turn the string into an integer, 
	}
}
