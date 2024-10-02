package Assignment2;

//3.Utilize an abstract class named Animal, featuring abstract
//methods sound() and move(), to design concrete subclasses such as Dog, Cat, and Bird
//that inherit from Animal and implement the necessary methods?
abstract class Animal {
	abstract void sound();

	abstract void move();
}

class Dog extends Animal {

	void sound() {
		System.out.println("Dog class sound..");

	}

	void move() {
		System.out.println("Dog class move");

	}
}

class Cat extends Animal {

	public void sound() {
		System.out.println("cat class sound");
	}

	public void move() {
		System.out.println("cat class move");
	}

}

class Bird extends Animal {

	void sound() {
		System.out.println("birds class animal");
	}

	void move() {
		System.out.println("bird class move");
	}

}

public class TestAnamal {
	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.sound();
		dog.move();

		System.out.println("==============================");

		Cat cat = new Cat();
		cat.sound();
		cat.move();
		System.out.println("==============================");

		Bird bird = new Bird();
		bird.sound();
		bird.move();
	}
}