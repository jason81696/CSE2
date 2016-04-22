//Jason Stein
//CSE002 1110-12
//HW

import java.util.Scanner;

public class CSE2Linear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		int search;
		boolean valid = false;
		int grades[] = new int[15];
		System.out.println("Enter your 15 final grades in CES2:");
		for (int i=0;i<15;i++) {
			valid = false;
			while (!valid) {
				valid = true;
				input = scan.next();
				for (int j=0;j<input.length();j++) {
					if (input.charAt(j) != '0' && input.charAt(j) != '1'
							 && input.charAt(j) != '2' && input.charAt(j) != '3'
							 && input.charAt(j) != '4' && input.charAt(j) != '5'
							 && input.charAt(j) != '6' && input.charAt(j) != '7'
							 && input.charAt(j) != '8' && input.charAt(j) != '9') {
						System.out.println("Invalid input.  Please enter again.");
						valid = false;
						break;
					}
				}
				if (!valid) {
					System.out.println("Not an integer, please enter a valid number.");
				} else {
					grades[i] = Integer.parseInt(input);
					if (grades[i] < 0 || grades[i] > 100) {
						System.out.println("Please enter an integer between 0 and 100.");
						valid = false;
					} else if (i != 0) {
						if (grades[i] < grades[i - 1]) {
							System.out.println("Please enter an integer larger than the previous integer.");
							valid = false;
						}
					}
				}
			}
		}
		for (int i=0;i<14;i++) {
			System.out.print(grades[i] + ", ");
		}
		System.out.println(grades[14]);
		System.out.println("Enter a grade to search for:");
		valid = false;
		while (!valid) {
			valid = true;
			input = scan.next();
			for (int i=0;i<input.length();i++) {
			if (input.charAt(i) != '0' && input.charAt(i) != '1'
					 && input.charAt(i) != '2' && input.charAt(i) != '3'
					 && input.charAt(i) != '4' && input.charAt(i) != '5'
					 && input.charAt(i) != '6' && input.charAt(i) != '7'
					 && input.charAt(i) != '8' && input.charAt(i) != '9') {
				System.out.println("Invalid input.  Please enter again.");
				valid = false;
				break;
			}
			}
			
		}
		valid = false;
		search = Integer.parseInt(input);
		for (int i=0;i<15;i++) {
			if (grades[i] == search) {
				System.out.println("Grade found after " + i + 1 + " iterations.");
				valid = true;
				break;
			}
		}
		if (!valid) {
			System.out.println("Grade not found.");
		}
	}

}
