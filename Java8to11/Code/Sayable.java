package exercise;

public interface Sayable{  
    default void say() {  
        saySomething();
        sayPolitely();
    }  
    // Private method inside interface  
    private void saySomething() {  
        System.out.println("Hello... I'm private method");  
    }  
    private static void sayPolitely() {  
        System.out.println("I'm private static method");  
    }
}  

