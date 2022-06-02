package oops;

public class Methodoverloading {
	int a;
	int b;
	
	void sum()
	{
		a=10;
		b=20;
		System.out.println(a+b);
		
		
	}
	void sum(int x,int y)
	{
		int a=x;
		int b=y;
		System.out.println(a+b);
	}
	void sum(int x,int y,int z)
	{
	
	System.out.println(x+y+z);
	}
	void sum(int a ,double b) 
	{
		System.out.println(a+b);
	}
	
	
	
	
	

	public static void main(String[] args) {
		Methodoverloading mo=new Methodoverloading();
		mo.sum();//call the first method
		mo.sum(10,200);//call the second method
		mo.sum(2000,3000,5000);//call the third method
		mo.sum(1010,1010.1);//call the fourth method
		

	}

}
