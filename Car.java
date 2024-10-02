package Assignment2;
//5.    Create classes for a Car and an Engine. The Car 

//class should contain an instance of the Engine class. Implement 
//methods to start and stop the car, and display engine details.

class Engine {
	public void EnginStart() {
		System.out.println("Start....");
	}

	public void EnginStop() {
		System.out.println("stop......");
	}
}

public class Car {
	public static void main(String[] args) {
		Engine engine = new Engine();
		engine.EnginStart();
		engine.EnginStop();
	}
}
