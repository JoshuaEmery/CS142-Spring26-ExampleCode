import java.util.Arrays;

public class RefVsValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables are stored in two basic ways
		//Value = Actual Value stored in the stack
		//if a copy or duplicate it I get two seperate values in the stack
		int x = 10;
		int y = x;
		System.out.println("X: " + x + " Y: " + y);
		x = 20;
		System.out.println("X: " + x + " Y: " + y);
		//Reference types store the address in the stack- points to the value in the
		//heap
		int[] numbers = {1, 2, 3};
		int[] numbers2 = numbers;
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers2));
		//Since numbers and numbers2 point to the same object in the heap
		//if I change EITHER of them I have changed them both
		numbers2[0]= 20;
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers2));
		//If you pass a reference type variable to a method
		//and that method changes it, it has changed permanently
	}
	
}
