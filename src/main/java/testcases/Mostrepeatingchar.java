package testcases;

import java.util.Scanner;

public class Mostrepeatingchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char[] arrysa = s.toCharArray();
		int count = 1;
		int max = 0;
		char maxChar = 0;
		for(int i=1; i<arrysa.length; i++){ // Start from 1 since we want to compare it with the char in index 0
		    if(arrysa[i]==arrysa[i-1]){
		        count++;
		    } else {
		        if(count>max){  // Record current run length, is it the maximum?
		            max=count;
		            maxChar=arrysa[i-1];
		        }
		        count = 1; // Reset the count
		    }
		}
		if(count>max){
		    max=count; // This is to account for the last run
		    maxChar=arrysa[arrysa.length-1];
		}
		System.out.println("Longest run: "+max+", for the character "+maxChar);
	}

}
