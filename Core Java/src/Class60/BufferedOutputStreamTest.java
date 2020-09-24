package Class60;

import java.io.*;

public class BufferedOutputStreamTest {
    
    public static void main(String[] args) throws Exception{
        FileOutputStream fout = new FileOutputStream("D:\\Exercise\\Java\\Code\\Java Knowledge\\Class-60\\fout.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        
        String s = "Md. Ashraful Islam Talukder";
        byte b[] = s.getBytes();
        bout.write(b);
        
        bout.flush();
        bout.close();
        System.out.println("success");
    }
}
