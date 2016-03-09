//Jason Stein
//CSE002
//Problem3HW6


public class TextSpinner {

	public static void main(String[] args) {
		int i = 1;
		System.out.print("/");
		while (true) {
			if (i == 0) {
				System.out.print("\b/");
			} else if (i == 1) {
				System.out.print("\b-");
			} else if (i == 2) {
				System.out.print("\b\\");
			} else {
				System.out.print("\b|");
			}
			i++;
			i = i % 4;
		}
	}
}