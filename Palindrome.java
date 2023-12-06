import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		System.out.printf("%s is %sa palindrome.%n", string, (isPalindrome(string.toCharArray(), 0) ? "" : "not "));
	}

	private static boolean isPalindrome(char[] chars, int i) {
		if (i == chars.length/2)
			return true;
		if (chars[i] == chars[chars.length - 1 - i])
			return isPalindrome(chars, ++i);
		return false;
	}
}
