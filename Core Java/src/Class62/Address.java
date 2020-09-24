package Class62;

import java.io.Serializable;

public class Address implements Serializable{
    /*
    If we use transient, this will not be serialized
    While desialized, the property value will set to its deafult value
    */
    transient String street;
    String country;
    
    public String getCountry(){
        return country;
    }
    
    public void setCountry(String country){
        this.country = country;
    }
    
    public String getStreet(){
        return street;
    }
    
    public void setStreet(String street){
        this.street = street;
    }
    
    @Override
    public String toString(){
        return new StringBuffer("Street: ").append(this.street).append(" Country: ").append(this.country).toString();
    }
}
