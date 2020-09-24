package Class60;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamTest {
    
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileInputStream fin = new FileInputStream("D:\\Exercise\\Java\\Code\\Java Knowledge\\Class-60");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1){
                System.out.println((char) i);
            }
            
            fin.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
