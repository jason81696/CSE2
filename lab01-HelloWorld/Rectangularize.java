import java.util.Scanner;

public class Rectangularize {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		boolean isInt = true;
		System.out.println("Please enter an input");
		input = scan.nextLine();
		for (int i=0;i<input.length();i++) {
			if (input.charAt(i) != '0' && input.charAt(i) != '1' && input.charAt(i) != '2' && input.charAt(i) != '3' && input.charAt(i) != '4' && input.charAt(i) != '5' && input.charAt(i) != '6' && input.charAt(i) != '7' && input.charAt(i) != '8' && input.charAt(i) != '9') {
				isInt = false;
				break;
			}
		}
		if (isInt) {
			printWord(Integer.parseInt(input));
		} else {
			printWord(input);
		}
	}
	public static void printWord(int num) {
		for (int i=0;i<num;i++) {
			for (int j=0;j<num;j++) {
				System.out.print("%");
			}
			System.out.println();
		}
	}
	
	public static void printWord(String word) {
		for (int i=0;i<word.length();i++) {
			System.out.println(word);
		}
	}
}