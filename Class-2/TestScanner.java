import java.util.Scanner;

public class TestScanner{

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		System.out.println("Total = "+(x+y));
	}
}