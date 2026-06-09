
public class InheritenceDemo {

	static class Class1 {
		public void methodOne() {
			System.out.println("Class 1 - Method 1");
		}

		public void methodTwo() {
			System.out.println("Class 1 - Method 2");
		}
	}

	// Extends allows us to inherit from another class
	// Class2 is class1
	static class Class2 extends Class1 {
		// Lets assume methodOne workse the same in class 2
		// but methodTwo needs to be modified
		@Override
		public void methodTwo() {
			System.out.println("Class 2 - Method 2 (Overridden)");
		}

		// Add some new functionality that class 1 did not have
		public void class2OnlyMethod() {
			System.out.println("This method is new to class 2");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 c1 = new Class1();
		Class2 c2 = new Class2();
		//I can pass either an instance of C1 or C2 to the demo method
		//because c2 IS A c1
		System.out.println("Displaying class 1");
		demo(c1);
		System.out.println("Displaying class 2");
		demo(c2);
	}

	static void demo(Class1 example) {
		example.methodOne();
		example.methodTwo();
		//example.class2OnlyMethod();
		//In order to access the class 2 specfic methods 
		//I need to check and see what type example is
		//I can do that with instanceof
		//This is called polymorphism
		if(example instanceof Class2) {
			Class2 example2 = (Class2)example;
			example2.class2OnlyMethod();
		}
		
	}


}
