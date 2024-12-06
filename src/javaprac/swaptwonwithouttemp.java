package javaprac;

public class swaptwonwithouttemp {

	public static void main(String[] args) {

		int a= 10 ; int b =20;
		
		System.out.println("before swapping");

		System.out.println(a);
		System.out.println(b);

		a = a-b;
		b = a+b;
		a = b-a;
		
		System.out.println("After swapping");

		System.out.println(a);
		System.out.println(b);
		
	}

	public static void main1(String[] args) {

		int a= 9 ; int b =30; int t=0;
		System.out.println("before swapping");

		System.out.println(a);
		System.out.println(b);
		
		t=a;
		a=b;
		b=t;
		System.out.println("After swapping");

		System.out.println(a);
		System.out.println(b);
		
	}
}
