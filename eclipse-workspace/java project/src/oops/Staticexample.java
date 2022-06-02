package oops;

public class Staticexample {
	int a;
	static int b;
	static void m1()
	{
		System.out.println("this is m1-static method");
	}
	 void m2()
	{
		System.out.println("this is m2-non static method");
	}
	void m3()
	{
		a=100;
		System.out.println(a);
		b=200;
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		b=20;
		System.out.println(b);
		m1();
		
		Staticexample se=new Staticexample();
		
	se.a=1;
	System.out.println(se.a);
	se.m2();
	se.m3();
	
	
	Staticexample se1=new Staticexample();
	se1.a=200;
	System.out.println(se1.a);
	
	se1.m2();
	se1.m3();
	
	
	
		
	
		
	}

}
