import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string = input.next();
		boolean bool = true;
		for(int i = 0; i < string.length(); i++)
			if (!(String.valueOf(string.charAt(i)).equals(String.valueOf(string.charAt(string.length()-i-1))))) 
				bool = false;
		System.out.printf("%s is %sa palindrome.%n", string, (bool ? "" : "not "));
	}
}
