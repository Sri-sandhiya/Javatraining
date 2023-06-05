package inheritance;

//base class
//constructor
class Circle {

	private double radius = 1.0;

	private String color = "red";

	public Circle() {

		super();

	}

	public Circle(double radius) {

		super();

		this.radius = radius;

	}

	public Circle(double radius, String color) {

		super();

		this.radius = radius;

		this.color = color;

	}

	public double getRadius() {

		return radius;

	}

	public void setRadius(double radius) {

		this.radius = radius;

	}

	public String getColor() {

		return color;

	}

	public void setColor(String color) {

		this.color = color;

	}

	public double getArea() {

		return Math.PI * radius * radius;

	}

	@Override

	public String toString() {

		return "Circle [radius=" + radius + ", color=" + color + "]";

	}

}

class Cylinder extends Circle {

	private double height = 1.0;

	public Cylinder() {

		super();

	}

	public Cylinder(double radius) {

		super(radius);

	}

	public Cylinder(double radius, double height) {

		super(radius);

		this.height = height;

	}

	public Cylinder(double radius, double height, String color) {

		super(radius, color);

		this.height = height;

	}

	public double getHeight() {

		return height;

	}

	public void setHeight(double height) {

		this.height = height;

	}

	public double getVolume() {

		return getArea() * height;

	}

	@Override

	public String toString() {

		return "Cylinder [height=" + height + "]";

	}

}

public class Tester {

	public static void main(String[] args) {

		Cylinder c1 = new Cylinder(2.3, 3.5);

		System.out.println("Radius : " + c1.getRadius());// 2.3

		System.out.println("Color : " + c1.getColor());// red

		System.out.println(c1);

		System.out.println("Volume of the Cylinder : " + c1.getVolume());
		
		Cylinder c2 = new Cylinder(2.5,3.8,"Blue");
		System.out.println("Radius : " + c2.getRadius());// 2.5

		System.out.println("Color : " + c2.getColor());// blue

		System.out.println(c2);

		System.out.println("Volume of the Cylinder : " + c2.getVolume());

		

	}

}
