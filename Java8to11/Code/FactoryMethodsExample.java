package exercise;

import java.util.List;  
public class FactoryMethodsExample {  
    public static void main(String[] args) {  
        List<String> list = List.of("Java","JavaFX","Spring","Hibernate","JSP");  // This creates a list of 5 elements.
        for(String l:list) {  
            System.out.println(l);  
        }  
    }  
} 
