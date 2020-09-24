package Class4;

public class InstanceVariable {
    
    public String name;
    private double salary;
    
    public InstanceVariable(String empName){
        name = empName;
    }
    
    public void setSalary(double empSal){
        salary = empSal;
    }
    
    public void printEmp(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
    
    public static void main(String[]args){
        InstanceVariable empOne = new InstanceVariable("Benedict Cumberbatch");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}
