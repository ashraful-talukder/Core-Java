package Class59;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    
    public static void main(String[] args) {
        try{
            String content = "This is the content to write intoo file";
            String content2 = "This is the second content to write into file";
            
            File file = new File("D:\\Exercise\\Java\\Code\\Java Knowledge\\Class-59\\write.txt");
            
            if (!file.exists()){
                file.createNewFile();
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(content);
                bw.newLine();
                bw.write(content2);
                bw.newLine();
                bw.close();
                System.out.println("Done");
            } else{
                System.out.println("File exists");
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
