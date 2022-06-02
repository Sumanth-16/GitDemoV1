package inheritance;
class vehicle
{
	void run()
	{
		System.out.println("vehicle is running");
	}
}
class bike extends vehicle
{
	void run()
	{
		System.out.println("bike is running");
	}
}
public class Test3 {

	public static void main(String[] args) {
		/*vehicle vobj=new vehicle();
		vobj.run();*/
		bike bobj=new bike();
		bobj.run();
		
		
		

	}

}
