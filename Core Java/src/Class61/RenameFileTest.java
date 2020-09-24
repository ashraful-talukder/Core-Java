package Class61;

import java.io.File;

public class RenameFileTest {
    
    public static void main(String[] args) {
        File oldfile = new File("D:\\Exercise\\Java\\Code\\Java Knowledge\\Class-61\\Hello.doc");
        File newfile = new File("D:\\Exercise\\Java\\Code\\Java Knowledge\\Class-61\\Okay.doc");
        
        if (oldfile.renameTo(newfile)) {
            System.out.println("Rename successful");
        } else {
            System.out.println("Rename failed");
        }
    }
}
