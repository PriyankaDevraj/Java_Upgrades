package exercise;

//import java.io.BufferedReader;
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.IOException;  
public class FinalVariable {  
	
	public static void main(String[] args) throws FileNotFoundException {  
        //this is a try with resources statement
    	try(FileOutputStream fileStream=new FileOutputStream("javatpoint.txt")){  
             String greeting = "Welcome to javaTpoint.";      
                byte b[] = greeting.getBytes();       
                fileStream.write(b);      
                System.out.println("File written");           
        }catch(Exception e) {  
            System.out.println(e);  
        }         
    }  
}
