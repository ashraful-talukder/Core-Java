package Class63;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class ReadProperty {
    
    public static void main(String[] args) {
        Properties prop = new Properties();
        InputStream input = null;
        
        try{
            input = new FileInputStream("config.properties");
            prop.load(input);
            System.out.println(prop.getProperty("database"));
            System.out.println(prop.getProperty("dbuser"));
            System.out.println(prop.getProperty("dbPassword"));
            Enumeration<?> e = prop.propertyNames();
            while (e.hasMoreElements()){
                String key = (String) e.nextElement();
                String value = prop.getProperty(key);
                System.out.println("Key: " + key + ", Value: " + value);
            }
        } catch (IOException io){
            io.printStackTrace();
        } finally{
            
            if (input != null){
                try{
                    input.close();
                } catch (Exception e){
                    e.printStackTrace();
                }
            } 
        }
    }
}
