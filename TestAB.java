package Assignment2;

//4.    Suppose a class 'A' has a static method to print 
//"Parent". Its subclass 'B' also has a static method with the 
//same name to print "Child". Now call this method by the objects of the two 
//classes. Also, call this method by an object of
//the parent class referring to the child class i.e. A obj=new B()
class A {
	public static void getParat() {
		System.out.println("parent");
	}
}

class B extends A {
	public static void getChild() {
		System.out.println("child");
	}

}

public class TestAB {
	public static void main(String[] args) {
		A a = new A();
		a.getParat();

		System.out.println("==========================");

		B b = new B();
		b.getChild();

		System.out.println("===========================");

		A a1 = new B();
		a1.getParat();

	}
}