package exceptionhandling;

public class Uncheckedexceptions {

	public static void main(String[] args) {
		int a=10;
		//System.out.println(a/0);//Arithmetic Exception
		//String s=null;
		//System.out.println(s.length());//NullPointerException
		/*String st="ABCD";
		int i=Integer.parseInt(st);
		System.out.println(i);*///NumberFormatException
		int arr[]=new int[5];
		arr[10]=100;//ArrayIndexOutofBoundException
		

	}

}
