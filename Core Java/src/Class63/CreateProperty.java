package Class63;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class CreateProperty {
    
    public static void main(String[] args) {
        Properties prop = new Properties();
        OutputStream output = null;
        
        /*
        Properties file creates at the ground of the project if the directory is not specified
        */
        try{
            output = new FileOutputStream("config.properties");
            prop.setProperty("database","localhost");
            prop.setProperty("dbuser","Ashraful");
            prop.setProperty("dbPassword", "123");
            
            prop.store(output, null);
        } catch (IOException io){
            io.printStackTrace();
        } finally {
            if (output != null){
                try{
                    output.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
