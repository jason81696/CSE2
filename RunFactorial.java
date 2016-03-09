import java.util.Scanner;

public class RunFactorial {

	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		int userInput;
		int factorial;
		System.out.println("Please enter an integer that is between 9 and 16:");
		userInput = readInt(myscanner);
		while (userInput < 9 || userInput > 16) {
			System.out.println("Invalid input, enter again!");
			userInput = readInt(myscanner);
		}
		System.out.println("Input accepted:");
		System.out.print(userInput + " != ");
		factorial = userInput;
		userInput--;
		while (userInput > 0) {
			factorial *= userInput;
			userInput--;
		}
		System.out.println(factorial);
	}
	
	private static int readInt(Scanner scanner) {
		String userData = "";
		boolean isValid = true;
		boolean readInputAgain = true;
		while (readInputAgain) {
			userData = scanner.nextLine(); // read a line from the user
			readInputAgain = false;
			isValid = true; // initialize as true so you don't infinite loop on one bad input
			for (int i=0;i<userData.length();i++) { // look at all the characters in userData
				// make sure they are all digits
				if (userData.charAt(i)!='0' && userData.charAt(i)!='1'&&userData.charAt(i)!='2'&&userData.charAt(i)!='3'&&userData.charAt(i)!='4'&&userData.charAt(i)!='5'&&userData.charAt(i)!='6'&&userData.charAt(i)!='7'&&userData.charAt(i)!='8'&&userData.charAt(i)!='9') {
					isValid = false; // if they aren't, the data is invalid
					break; // no need to check all chars if one isn't a digit
				}
			}
			if (!isValid) { // if it's not valid, tell the user and ask for input again
				System.out.println("Invalid input, enter again!");
				readInputAgain = true;
			}
		}
		return Integer.parseInt(userData); // turn the string into an integer
	}

}
