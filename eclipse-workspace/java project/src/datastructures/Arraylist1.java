package datastructures;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList a1= new ArrayList ();
		//adding elements to array list
		System.out.println("number of elements in arraylist "+a1.size());//number elements present in al
		System.out.println(" elements in arraylist "+a1);
		a1.add("welcome");
		a1.add(1);
		a1.add(16.45);
		a1.add('c');
		a1.size();
		System.out.println("number of elements in arraylist before inserting "+a1.size());//number elements present in al
		System.out.println(" elements in arraylist before inserting "+a1);
		//inserting elements into arraylist
		a1.add(1,"sumanth");//1 is describes after number of elements not position
		System.out.println(" elements in arraylist before inserting "+a1);
		a1.add(2,6.45);//2 is describes after number of elements not position
		System.out.println("number of elements in arraylist  after inserting "+a1.size());
		System.out.println("number of elements in arraylist after inserting"+a1);
		//removing elements from array list
		a1.remove("welcome");//directly describing the value
		System.out.println(" elements in arraylist before inserting "+a1);
		a1.remove(2);//2  is describes after number of elements not exactly position
		System.out.println(" elements in arraylist before inserting "+a1);
		}
		
	}


