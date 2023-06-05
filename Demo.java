package inheritance;

/**
 * to create hierarchial inheritance
 * 
 * @author sandhiyasri
 *
 */

//base class
class Vechile {
	private String make;
	private String model;
	private int year;

	public Vechile(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public void displayInfo(String make, String model, int year) {
		System.out.println("make: " + make);
		System.out.println("model: " + model);
		System.out.println("year: " + year);
	}
}

//derived class
class Car extends Vechile {
	public int numDoors;

	public Car(String make, String model, int year, int numDoors) {
		super(make, model, year);
		this.numDoors = numDoors;
	}

	public void startEngine() {
		System.out.println("Engine started");
	}

}

class Motorcycle extends Vechile {
	public boolean isDoorsThere;

	public Motorcycle(String make, String model, int year, boolean isDoorsThere) {
		super(make, model, year);
		this.isDoorsThere = isDoorsThere;
	}

	public void startEngine() {
		System.out.println("Engine started");
	}

}

public class Demo {
	public static void main(String[] args) {
         //creating objects for derived classes
		Car c1 = new Car("April", "suv", 23, 1);
		Motorcycle m1 = new Motorcycle("june", "xs", 34, true);

		c1.startEngine();
		c1.displayInfo("june", "xs", 34);
		m1.displayInfo("april", "suv", 3);
		m1.startEngine();

	}

}
