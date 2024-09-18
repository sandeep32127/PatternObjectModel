package testcases;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the company of your choice :");
		String word = scan.nextLine();
		char[] charArray = word.toCharArray();
		Set<Character>  sd = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i+1; j < charArray.length; j++) {
				if(charArray[i] == charArray[j]) {
					sd.add(charArray[i]);
				}
			}
		}
		//System.out.println(sd);
		for (char character : sd) {
			sb.append(character);
		}
		System.out.println(sb.toString());
	}

}
