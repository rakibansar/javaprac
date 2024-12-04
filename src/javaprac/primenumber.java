package javaprac;

public class primenumber {

	public static void main(String[] args) {

		int t =0;
		int p =18
				
				;
		for (int i =2; i<p ;i ++)
		{
			if (p%i==0)
			{
				System.out.println("Nmber is not prime ");
				t =1;
			    break;
			}
			
			
			
		}
		if(t==0)
		System.out.println("Prime ");
	}

}
