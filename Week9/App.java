
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Making an instance of horse - using the constructor
		Horse horse1 = new Horse("I Know she knows I know", "Stallion", 5, 10);
		//I use the instance variable to access the methods
		System.out.println(horse1.getWeight());
		System.out.println(horse1.getName());
		System.out.println(horse1.getBreed());
		//Call the setter function to change name
		horse1.setName("Not nearly as cool of a name");
		System.out.println(horse1.getName());
		//Height should not be able to be set to negative.
		//This will throw an exception
		//horse1.setHeight(-10);
		//System.out.println(horse1.getHeight());
		//Objects are stored by reference not value
		Horse horse2 = horse1;
		horse2.setWeight(100);
		System.out.println("Horse 1 weight " + horse1.getWeight());
		//Calling a static method
		//Static methods are called on the class itself and can be run without making an instance
		System.out.println(Horse.testStatic());

	}

}
