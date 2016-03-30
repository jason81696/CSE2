import java.util.Scanner;

public class Games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput;
		boolean validInput = false;
		System.out.println("Welcome to Jason's game center");
		System.out.println("Which game would you like to play?");
		Scanner scan = new Scanner(System.in);
		do {
			userInput = scan.nextLine();
			if (userInput.compareTo("guessTheBox") == 0) {
				validInput = true;
				guessTheBox();
			} else if (userInput.compareTo("spinTheWheel") == 0) {
				validInput = true;
				spinTheWheel();
			} else if (userInput.compareTo("scrambler") == 0) {
				validInput = true;
				scrambler();
			} else {
				System.out.println("Invalid input.  Your choices are " +
			"\"guessTheBox\", \"spinTheWheel\", or \"scrambler\"");
				validInput = false;
			}
		} while (!validInput);
	}
	public static void guessTheBox() {
		int boxNumber = (int) (Math.random() * 3);
		String userInput;
		int guess = -1;
		boolean validInput = false;
		System.out.println("Which box has the prize?");
		System.out.println("Is it box 1, 2, or 3?");
		Scanner scan = new Scanner(System.in);
		do {
			userInput = scan.nextLine();
			if (userInput.compareTo("1") == 0) {
				guess = 1;
				validInput = true;
			} else if (userInput.compareTo("2") == 0) {
				guess = 2;
				validInput = true;
			} else if (userInput.compareTo("3") == 0) {
				guess = 3;
				validInput = true;
			} else {
				System.out.println("Invalid entry.  Please guess \"1\", \"2\", or \"3\".");
				validInput = false;
			}
		} while (!validInput);
		if (guess == boxNumber) {
			System.out.println("Congratulations, you won a prize!");
		} else if (guess != -1 && guess != boxNumber) {
			System.out.println("Sorry, you didn't win this time.");
		}
	}
	
	public static void spinTheWheel() {
		String userInput;
		boolean validInput = false;
		int color = 0;
		int number = 0;
		int randomNum;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please guess a color: ");
		do {
			userInput = scan.nextLine();
			if (userInput.toLowerCase().compareTo("red") == 0) {
				color = 0; // red
				validInput = true;
			} else if (userInput.toLowerCase().compareTo("black") == 0) {
				color = 1; // black
				validInput = true;
			} else {
				System.out.println("Invalid guess.  Please guess either \"red\" or \"black\".");
				validInput = false;
			}
		} while (!validInput);
		System.out.println("Please guess a number from 1 to 5:");
		do {
			userInput = scan.nextLine();
			if (userInput.compareTo("1") == 0) {
				number = 1;
				validInput = true;
			} else if (userInput.compareTo("2") == 0) {
				number = 2;
				validInput = true;
			} else if (userInput.compareTo("3") == 0) {
				number = 3;
				validInput = true;
			} else if (userInput.compareTo("4") == 0) {
				number = 4;
				validInput = true;
			} else if (userInput.compareTo("5") == 0) {
				number = 5;
				validInput = true;
			} else {
				System.out.println("Invalid input.  Please enter a number from 1 to 5.");
				validInput = false;
			}
		} while (!validInput);
		randomNum = (int) (Math.random() * 9 + 1);
		System.out.println("Rolled a " + (((randomNum + 1) % 2 == 0) ? "red" : "black") +
		" " + ((randomNum + 1) / 2) + ".");
		if ((randomNum + 1 ) % 2 == color) {
			if ((randomNum + 1) / 2 == number) {
				System.out.println("Congratulations, you won!");
			} else {
				System.out.println("Sorry, you didn't win this time.");
			}
		} else {
			System.out.println("Sorry, you didn't win this time.");
		}
		return;
	}

	
	public static void scrambler() {
		String input;
		int max;
		int random;
		char placeHolder;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a word:");
		input = scan.nextLine();
		max = (int) (Math.random() * 100);
		for (int i = 0;i<max;i++) {
			random = (int) (Math.random() * input.length());
			placeHolder = input.charAt(random);
			if (random != 0) {
				input = placeHolder + input.substring(1, random) + input.charAt(0) + input.substring(random + 1);
			}
		}
		System.out.println(input);
	}
}
