package javaprac;

public class FibonacciSeries {

	public static void main(String[] args) {

		int i =0 ; 
		int a =1 ;	
		System.out.println(i);
		System.out.println(a);
		for (int z=0; z<=10; z++)
		{
			int t = i + a;
			System.out.println(t);
			i = a;
			a=t;
		}
		
		
		
	}

}
