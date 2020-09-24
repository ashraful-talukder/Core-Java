package Class16;

class Employee{
    public String name;
    public int employeeId;
    
    public Employee(){
        this.employeeId = 1;
        this.name = "Kalam";
    }
    
    public Employee(int id, String name){
        this.employeeId = id;
        this.name = name;
    }
    
    String getDetails(){
        return "Id is " + employeeId + " and Name is " + name;
    }
}
public class Manager extends Employee{
    public String department;
    
    public Manager(int id, String name, String department){
        super(id,name);
        this.department = department;
    }
    
    @Override
    String getDetails(){
        return "subdetails";
    }
    
    public static void main(String[]args){
        Manager mgr = new Manager(1, "Md. Ashraful", "Computer R&D");
        mgr.print();
        Employee e = new Manager(1, "X", "B");
        mgr = (Manager)e;
        System.out.println(mgr.getDetails());
    }
    
    void print(){
        System.out.println("Name = " + name);
        System.out.println("Department = " + department);
    }
}
