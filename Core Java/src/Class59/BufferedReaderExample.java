package Class59;

import java.io.*;

public class BufferedReaderExample {
    
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("D:\\Exercise\\Java\\Code\\Java Knowledge\\Class-59\\newfilename.txt"));
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null){
                System.out.println(sCurrentLine);
            }
            br.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
