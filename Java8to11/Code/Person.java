package exercise;


import java.util.Arrays;
import java.util.List;

public class Person {
	
	public enum Sex {
        MALE, FEMALE
    }
	private String name;
	private String lastName;
	private int age;
	private Sex gender;
	
	

	public Person(String name, String lastName, int age, Sex gender) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Sex getGender() {
		return gender;
	}
	public void setGender(Sex gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [firstName = "+name+" lastName = "+lastName+" age = "+age+"]";
	}
	
	public static List<Person> createRoster(){
		List<Person> people = Arrays.asList(
				new Person("Priyanka","Devraj",39,Sex.FEMALE),
				new Person("Anish","Kumar",41,Sex.MALE),
				new Person("Priyanshi","Kumar",7,Sex.FEMALE),
				new Person("Damyanti","Devraj",62,Sex.FEMALE),
				new Person("Prabhakar","Devraj",67,Sex.MALE)
				);
		
		return people;
	}
	
}
