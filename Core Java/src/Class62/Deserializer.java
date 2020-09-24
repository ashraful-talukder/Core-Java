package Class62;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializer {
    
    public static void main(String[] args) {
        Deserializer deserializer = new Deserializer();
        Address address = new Address();
        address = deserializer.deserializeAddress();
        System.out.println(address);
    }
    
    public Address deserializeAddress(){
        Address address;
        /*
        Reading from the file and this is called deserialization.
        */
        try{
            FileInputStream fin = new FileInputStream("D:\\Exercise\\Java\\Code\\Java Knowledge\\Class62\\Serial.ser");
            ObjectInputStream ois = new ObjectInputStream(fin);
            address = (Address) ois.readObject();
            ois.close();
            return address;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
