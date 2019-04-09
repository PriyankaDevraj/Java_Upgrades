package lambda;

public class MyLambda {
	
	public static void main(String args[]) {
		
		Greeting lambdaGreeting = () -> System.out.println("Hello World!");
		lambdaGreeting.greet();
	}

}

interface Greeting{
	public void greet();
}
