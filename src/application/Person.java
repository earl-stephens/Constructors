package application;

public class Person {
	private String name;
	private double height;

	/*
	 * Constructor is the only method where you don't have to use void/String/etc
	 * must have the same name as the class.
	 * Code block is run automatically when the object is instantiated
	 */
	public Person() {
		System.out.println("Person was created!");
		name = "?";
		height = 0.0;
		System.out.printf("Defaults are %s for name and %.1f for height.\n", name, height);
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
