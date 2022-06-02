package oops;

public class Constructoroverloading {
	int a=0;
	int b=0;
	double c=0;
	
	Constructoroverloading()
	{
		a=10;
		b=20;
		c=30.5;
	}
	Constructoroverloading(int x ,int y)
	{
		a=x;
		b=y;
		
	}
	Constructoroverloading(int x ,double y)
	{
		a=x;
		c=y;
		
	}
	Constructoroverloading(int x ,int y,double z)
	{
		a=x;
		b=y;
		c=z;
		
	}
	Constructoroverloading(int x ,double y,int z)
	{
		a=x;
		c=y;
		b=z;
		
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		}
	
	
	

	public static void main(String[] args) {
		Constructoroverloading co=new Constructoroverloading(100,20.1,20);
		co.display();
		
		

	}

}
