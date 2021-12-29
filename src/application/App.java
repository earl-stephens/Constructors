package application;

public class App {

	public static void main(String[] args) {
		/* Constructors are method unique to a class that run
		 * automatically as soon as an object of that class is
		 * instantiated.
		 * Java will have a default constructor always.  The 
		 * constructors here are explicitly defined.
		 */
		
		/* Person(); in the line below is a method call to the
		 * Person constructor
		 */
		Person person1 = new Person();
		
		//These work, but they are a little verbose
		person1.setName("Mary");
		person1.setHeight(160.0);
		System.out.println(person1.getName());
		System.out.println(person1.getHeight());
		
		Person person2 = new Person();
		person2.setName("Joe");
		person2.setHeight(170.5);
		System.out.println(person2.getName());
		System.out.println(person2.getHeight());	
	}

}
