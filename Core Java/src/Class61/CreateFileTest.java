package Class61;

import java.io.File;
import java.io.IOException;

public class CreateFileTest {
    
    public static void main(String[] args) {
        try{
            File file = new File("D:\\Exercise\\Java\\Code\\Java Knowledge\\Class-61\\Hello.doc");
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else{
                System.out.println("File already exists");
            } 
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
