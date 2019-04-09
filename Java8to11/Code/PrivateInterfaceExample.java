package exercise;

public class PrivateInterfaceExample implements Sayable {  
    public static void main(String[] args) {  
        Sayable s = new PrivateInterfaceExample();  
        s.say();  
    }  
} 