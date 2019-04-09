package lambda;

public class TypeInferenceLambda {
	
	public static void main(String[] args) {
		

		
		StringLengthLambda stringLengthLambda = s -> s.length();
		System.out.println(stringLengthLambda.getLength("Priyanka Devraj"));
		printLambda(s->s.length());
		
	}
	
	interface StringLengthLambda{
		
		public int getLength(String s);
	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("Priyanshi Kumar"));
	}

}
