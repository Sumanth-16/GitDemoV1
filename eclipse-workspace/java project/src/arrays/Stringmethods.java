package arrays;

public class Stringmethods {

	public static void main(String[] args) {
		String s="welcome";
		System.out.println(s.length());
		String s1="welcome";
		String s2="to india";
		System.out.println(s1.concat(s2));
		System.out.println("welcome".concat("to india"));
		System.out.println(s1+s2);
		System.out.println("welcome"+"to india");
		String s3="training";
		String s4="Training";
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s.contains("me"));
		System.out.println(s.substring(1,4));
		System.out.println(s.replace("wel","com"));
		
		
		
		

	}

}
