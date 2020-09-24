public class SimpleAssertFalse{

	public static void main(String[]args){
		int x = 1;
		assert(x > 3);					//1. Simple form
		//assert(x > 3) : "Assertion Error Caught";	//2. Augmented form
		System.out.println("Everything okay");
	}
}