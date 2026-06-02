
public class Horse {
	//fields - the information that you want to capture about the object
	//should be private
	private String name;
	private String breed;
	private double height;
	private double weight;
	//Constructor - Special method that is called to create an instance
	//of your class
	//assign values to the fields
	
	public Horse(String name, String breed, double height, double weight) {
		//inside of the constructor we have access to a new keyword
		//this - refers to the instance of the class we are creating
		//we also need to validate when we take in data for the constructor
		//you can set the fields
//		this.name = name;
//		this.breed = breed;
//		this.height = height;
//		this.weight = weight;
		//you can also use your setter functions to assign the fields
		this.setName(name);
		this.setHeight(height);
		this.setWeight(weight);
		this.setBreed(breed);
	}
	//methods - Actions that a class can take
	//getters/setters
	//The getters and setters provide access to the fields
	//If the user of the class should be able to read a field, that field
	//should have a getter
	public String getName() {
		return this.name;
	}
	//If the user of your class should be able to change a field, that field should
	//have a setter
	public void setName(String name) {
		this.name = name;
	}
	//everything else
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height <= 0) {
			//Here we are raising an exception. If not handled it crashed the app
			throw new IllegalArgumentException(height + "cannot be 0 or less");
		}
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		if(weight <= 0) {
			//Here we are raising an exception. If not handled it crashed the app
			throw new IllegalArgumentException(weight + " cannot be 0 or less");
		}
		this.weight = weight;
	}
	//Breed can be read from outside the class
	public String getBreed() {
		return breed;
	}
	//Breed can only be set from inside the class
	private void setBreed(String breed) {
		this.breed = breed;
	}
	//A state method can be called WITHOUT making an instance of the class
	
	public static String testStatic() {
		//inside of a static method you do not have access to this or any of the fields
		return "This is a static method";
	}
	

}
