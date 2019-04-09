package exercise;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String[] str = new String[10];
		Optional<String> checkNull = Optional.ofNullable(str[5]); 
		if(checkNull.isPresent()) {
			String str1 = str[5].toLowerCase();
			System.out.println(str1);
	
		}else System.out.println("String is null");
	}
}
