import java.io.*;

public class BufferedReaders{

	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		System.out.println(a);
	}
}
