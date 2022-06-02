package inheritance;
class A
{
	int a;
	int b;
	void display()
	{
		System.out.println(a+b);
		
	}
}
class B extends A
{
	int x;
	int y;
	void show()
	{
		System.out.println(x+y);
		
	}
}

	class c extends B
	{
		
	
	int p;
	int q;
	void add()
	{
		System.out.println(p+q);
	}
	
}
public class Test1 {
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		c cobj=new c();
		cobj.a=100;
		cobj.b=200;
		cobj.x=300;
		cobj.y=400;
		cobj.p=500;
		cobj.q=600;
		cobj.display();
		cobj.show();
		cobj.add();
		
		
		
	}

}


