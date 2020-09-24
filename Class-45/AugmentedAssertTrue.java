public class AugmentedAssertTrue{

	public static void main(String[]args){
		int x = 1;
		//assert(x > 0);					//1. Simple form
		assert(x > 0) : "Assertion Error Caught";		//2. Augmented form
		System.out.println("Everything okay");
	}
}