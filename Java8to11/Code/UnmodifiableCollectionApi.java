package exercise;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;


public class UnmodifiableCollectionApi {
	
	public static void main(String[] args) {
		Map<Integer,String> userList = new HashMap<>();
		userList.put(1, "Shweta");
		userList.put(2, "Pallavi");
		userList.put(3, "Jack");
		userList.put(4, "Kailash");
		userList.put(5, "Max");
		userList.put(6, "Timothy");
		userList.put(7, "Abhishek");
		
		
		//Creating immutable collection using new Map.copyOf API
		Map<Integer,String> userListCopy = Map.copyOf(userList);
		
		//Below mentioned code will throw  java.lang.UnsupportedOperationException on execution
		//userListCopy.remove(5);
		
		//Creating immutable map using unmodifiableMap
		Map<Integer,String> userListCopy1 = Collections.unmodifiableMap(userListCopy);
		
		System.out.println("\n-----------------Printing User list --------------\n");
		userList.forEach((k,v) -> System.out.println("User ID is : "+k+" and Password is : "+v));
		
		System.out.println("\n-----------------Printing Copy of User list --------------\n");
		userListCopy.forEach((k,v) -> System.out.println("User ID is : "+k+" and Password is : "+v));
		
		System.out.println("\n-----------------Printing Copy of User list --------------\n");
		Iterator<Map.Entry<Integer,String>> mapitr = userListCopy1.entrySet().iterator();
		while(mapitr.hasNext()) {
			System.out.println(mapitr.next());
		}
		
		
	}

}
