package Class36;

public class Encapsulation {
    private int empCode;
    private String empName;
    private int empAge;
    
    public int getEmpCode(){
        return empCode;
    }
    
    public String getEmpName(){
        return empName;
    }
    
    public int getEmpAge(){
        return empAge;
    }
    
    public void setEmpCode(int newValue){
        empCode = newValue;
    }
    
    public void setEmpName(String newValue){
        empName = newValue;
    }
    
    public void setEmpAge(int newValue){
        empAge = newValue;
    }
}
