package javaprac;

public  class repetstring {

	public static void main(String[] args) {
        String string = "Rakib and ansar and and intre";
        String substring = "and";

        int count = 0;
        StringBuilder builder = new StringBuilder(string);
        while (builder.indexOf(substring) != -1) {
        	System.out.println(builder.indexOf(substring));

            count++;
            builder.delete(builder.indexOf(substring), builder.indexOf(substring) + substring.length());
            
        }

        System.out.println("The substring '" + substring + "' occurs " + count + " times in the string.");
    }

}
