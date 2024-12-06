package javaprac;

public class reversenumber {

	public static void main(String[] args) {

		int i =1234;
		
		System.out.println("Before reverse "  + i);
		while (i!=0)
		{
		int p =i%10 ;
		System.out.print(p);
		i = i/10 ;
		}	
	}

}
