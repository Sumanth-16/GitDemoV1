package arrays;

public class Arraywithforeachloop {

	public static void main(String[] args) {
		String s[]=new String[5];
		s[0]="welcome";
		s[1]="to";
		s[2]="the";
		s[3]="testing";
		s[4]="field";
		System.out.println(s.length);
		for(String i:s)
		{
			System.out.println(i);
		}
	}

}
