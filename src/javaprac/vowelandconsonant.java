package javaprac;

import java.util.Scanner;

public class vowelandconsonant {

	public static void main(String[] args) {
		Scanner cha = new Scanner(System.in) ;
		System.out.println("Enter Character ");
		char ch = cha.next().charAt(0);
		
		if(ch == 'a'|| ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u')
	    	{
			 System.out.println("Character is Vowel");
	    	}
	    	else {System.out.println("Character is consonant");} 	
			
			
	}
		

}
