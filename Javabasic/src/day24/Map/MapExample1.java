package day24.Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
public static void main(String[] args) {
		
		Map m1=new HashMap();
		m1.put("key1", "admin");//upcasting
		//System.out.println(m1.put("key2", "admin"));
		m1.put("key2", "admin");//upcasting
		//System.out.println(m1.put("key2", "admin"));
		m1.put(null, "admin123");//upcasting
		//m1.put(null, "admin123");
		System.out.println("Map elements are: \n"+m1);
		System.out.println("Map element count: \n"+m1.size());
		m1.put("key2", "manager");
		m1.put(458, "manager");
		m1.put(null, 1234);//boxing dn upcasting
		System.out.println("Map elements are: \n"+m1);
		System.out.println("Map element count: \n"+m1.size());
		System.out.println("Get the key value: \n"+m1.get("key2"));
		
		System.out.println("key set of map: \n"+m1.keySet());
		System.out.println("values of map: \n"+m1.values());		
	}
}
