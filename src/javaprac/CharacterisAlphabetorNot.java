package javaprac;

import java.util.Scanner;

public class CharacterisAlphabetorNot {

	public static void main1(String[] args) {

		Scanner build = new Scanner(System.in);
		System.out.println("Enter Character");
		char c = build. next().charAt(0);
		
			if ((c >='a' & c<='z' )||(c >='A' & c<='Z' ))
		
		       System.out.println("Char is Alphabet");
		
		    else		
		    	  System.out.println("Char is not Alphabet");
		
	}
	
	public static void main(String[] args) {

		Scanner build = new Scanner(System.in);
		System.out.println("Enter Character");
		char c = build. next().charAt(0);
		
			if (Character.isAlphabetic(c))
		
		       System.out.println("Char is Alphabet");
		
		    else		
		    	  System.out.println("Char is not Alphabet");
		
	}

}
