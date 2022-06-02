package oops;

public class Employee
{
	int empid;
	String empname;
	int salary;
	int deptno;
	/*Employee(int id, String name,int sal,int dno)
	{
		empid=id;
		empname=name;
		salary=sal;
		deptno=dno;
		
		
	}*/
	void setdata(int id,String name,int sal,int dno) 
	{
		empid=id;
		empname=name;
		salary=sal;
		deptno=dno;
	}
	
	void display()
	
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
		
		
	}
	public static void main(String args[])
	{
		//assigning the values to the variables in the class using constructor method(second method)// 
		
		/*Employee emp1=new Employee(101,"manish",10000,101);
		emp1.display();
		Employee emp2=new Employee(202,"manoj",50000,10101);
		emp2.display();*/
		//assigning the values to the variables of the class using method(third method)//
		Employee emp1=new Employee();
		emp1.setdata(10235, "manoharan", 10000, 16);
		emp1.display();
		Employee emp2=new Employee();
	    emp2.setdata(15203, "janardhan",10000,100);
	    emp2.display();
				
		
		
		//assigning valuse to the variables in the class using object method(first method)//
		/*Employee emp1=new Employee();
		emp1.empid=12305;
		emp1.empname="devanand";
		emp1.salary=20000;
		emp1.deptno=52;
		emp1.display();
		Employee emp2=new Employee();
		emp2.empid=20135;
		emp2.empname="sumitra";
		emp2.salary=30000;
		emp2.deptno=56;
		emp2.display();*/
				
		
	}
	
	

}
