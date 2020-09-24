package Class61;

import java.io.File;

public class DeleteFileTest {
    
    public static void main(String[] args) {
        try{
            File file = new File("D:\\Exercise\\Java\\Code\\Java Knowledge\\Class-61\\Okay.doc");
            if(file.delete()){
                System.out.println(file.getName() + " is deleted!");
            } else {
                System.out.println("Delete operation is failed!");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
