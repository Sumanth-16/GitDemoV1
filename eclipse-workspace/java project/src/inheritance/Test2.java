package inheritance;

class Bank
{
	int rateofinterest()
	{
	return 0;	
	}
}

class sbi extends Bank
{
	int rateofinterest()
	{
		return 10;
	}
}
class icici extends Bank
{
	int rateofinterest()
	{
		return 20;
	}
}
class axis extends Bank
{
	int rateofinterest()
	{
		return 30;
	}
}




public class Test2 {

	public static void main(String[] args) {
		Bank bobj=new Bank();
			System.out.println(bobj.rateofinterest());
		sbi sobj =new sbi();
		System.out.println(sobj.rateofinterest());
		icici iobj=new icici();
		System.out.println(iobj.rateofinterest());
		axis aobj=new axis();
		System.out.println(aobj.rateofinterest());
		
		

	}

}
