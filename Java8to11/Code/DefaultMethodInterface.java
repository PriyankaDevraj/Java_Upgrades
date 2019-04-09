package lambda;

public interface DefaultMethodInterface{
	 
	 public int add(int a,int b);
	 
	 default int substract(int a,int b) {
		 return a-b;		 
	 }
	 
}