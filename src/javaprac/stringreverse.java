package javaprac;

public class stringreverse {

	public static void main(String[] args) {

		String r = "Good Morning";
		
		StringBuilder build = new StringBuilder(r) ;
		build.append("Java");
		
		
		System.out.println(build.reverse());
	}

}
