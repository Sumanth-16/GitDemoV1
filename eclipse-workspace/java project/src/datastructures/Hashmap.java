package datastructures;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		HashMap <Integer,String> hm=new <Integer,String> HashMap();
		//Adding  keypairs into Hashmaps
		hm.put(100,"amul");
		hm.put(200, "canon");
		hm.put(300, "value");
		System.out.println(hm);
	for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
		hm.remove(300);
		System.out.println(hm);

	}

}
