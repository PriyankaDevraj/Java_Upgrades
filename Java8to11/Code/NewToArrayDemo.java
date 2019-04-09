package exercise;

import java.util.Arrays;
import java.util.Set;

public class NewToArrayDemo {

	public static void main(String[] args) {

		Set<String> courses = Set.of("ISEM","Project Management","Computer Science","Analytics");
		
		//Use of Collection.toArray(IntFunction)
		System.out.println(Arrays.toString(courses.toArray(String[]::new))); 

	}

}
