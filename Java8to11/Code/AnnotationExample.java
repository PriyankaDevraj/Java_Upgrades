package annotations;

import java.lang.annotation.Repeatable;

import org.eclipse.jdt.annotation.NonNull;

//Repeatable Annotation
@Author(name = "Priyanka")
@Author(name = "Priyanshi")
public class AnnotationExample {
	
	String myString;
	
	public int findLength(String str) {
		
	//Type Annotation example
	String myString = (@NonNull String) str;
	return myString.length();
	
	}
}
//Defining repeatable annotation
@Repeatable(Authors.class)
@interface Author{
	String name();
}
@interface Authors{
	Author[] value();
}