package application;

public class Person {
	private String name;
	private double height;

	/*
	 * Constructor is the only method where you don't have to use void/String/etc
	 * must have the same name as the class.
	 * Code block is run automatically when the object is instantiated
	 
	public Person() {
		System.out.println("Person was created!");
		name = "?";
		height = 0.0;
		System.out.printf("Defaults are %s for name and %.1f for height.\n", name, height);
	}
	 */
	
	// This constructor can take any data type for parameters
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
		System.out.printf("Defaults are %s for name and %.1f for height.\n", name, height);
	}
	
	// This constructor is used when you don't want to provide default values
	// when instantiating an object
	// Can have multiple constructors
	
	public Person() {
		this.name = "?";
		this.height = 0.0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
