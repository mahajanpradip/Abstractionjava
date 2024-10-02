package Assignment2;

final public class Person {
	private final String name;
	private final int age;

	public Person() {
		name = "pradip";
		age = 23;
	}

	public void display() {
		System.out.println("Name is ==>>> " + name);
		System.out.println("age is ==>>> " + age);
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.display();
		System.out.println("===========================");
		Person person1 = new Person();
		person.display();

	}
}
