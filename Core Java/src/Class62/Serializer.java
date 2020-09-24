package Class62;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {
    
    public static void main(String[] args) {
        Serializer serializer = new Serializer();
        Address add = new Address();
        add.setStreet("Wall Street");
        add.setCountry("London");
        System.out.println(add);
        
        Address address = new Address();
        address.setStreet("13/2 Dilu Road");
        address.setCountry("Dhaka");
        serializer.serializerAddress(address);
    }

    public void serializerAddress(Address add){
        /*
        Writing within a file and this is called serialization.
        */
        try{
            FileOutputStream fout = new FileOutputStream("D:\\Exercise\\Java\\Code\\Java Knowledge\\Class62\\Serial.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(add);
            oos.close();
            System.out.println("Done");
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
