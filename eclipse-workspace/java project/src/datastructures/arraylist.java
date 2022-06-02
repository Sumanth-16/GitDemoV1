package datastructures;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		ArrayList <String> list =new ArrayList <String> ();
// adding elements to ArrayList
		list.add("sumanth");
		list.add("abhinav");
		list.add("raju");
		list.add("rajitha");
		list.add("sumanth goud");
		 list.size();
		 System.out.println(list.size());
		 for(String s:list)
		 {
			 System.out.println(s); 
		 }
	}

}
