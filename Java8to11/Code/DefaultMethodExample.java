package lambda;

public class DefaultMethodExample implements DefaultMethodInterface{
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		DefaultMethodExample defaultMethodExample = new DefaultMethodExample();
		System.out.println(defaultMethodExample.add(10, 100));
		System.out.println(defaultMethodExample.substract(10, 100));
	}

}
