package javaprac;

import java.util.Scanner;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {

	Scanner  num =  new Scanner(System.in);
		System.out.println("Enter A");
		int a = num.nextInt();
		System.out.println("Enter B");
		int b = num.nextInt();
		System.out.println("Enter C");
		int c = num.nextInt();
		
		if (a>b & a>c)
		{
			System.out.println(" A is largest ");
		}
		
		else if  (b>c)
		{
		System.out.println(" B is largest " );
		}
		
		else {		System.out.println(" c is largest " );}
	}

}

