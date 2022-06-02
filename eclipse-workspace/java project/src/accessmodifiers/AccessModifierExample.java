package accessmodifiers;
class A
{
	/* private int a=10;
	 private void m1()
	{
		System.out.println(a);
	}*/
	int a=10;
	void m1()
	{
		System.out.println(a);
	}
}


public class AccessModifierExample {

	public static void main(String[] args) {
		A aobj=new A();
		/*aobj.a=10;//cannot access since it is private 
		aobj.m1();//cannot access since it is private */
		aobj.a=10;// access since it is default
		aobj.m1();//access since it is default
		

	}

}
