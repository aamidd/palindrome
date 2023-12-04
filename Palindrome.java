import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		boolean bool = true;
		for(int i = 0; i < string.length()/2; i++)
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				bool = false;
				break;
			}
		System.out.printf("%s is %sa palindrome.%n", string, (bool ? "" : "not "));
	}
}
