package testcases;

import java.util.Scanner;

public class Stringnext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string of your choice :");
		String word = scan.nextLine();
		String word2 = null;
		char[] charArray = word.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = (char) (charArray[i] + 1);
			sb.append(charArray[i]);
		}
		word2 = sb.toString();
		System.out.println(word2);
	}

}
