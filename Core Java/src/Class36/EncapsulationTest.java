package Class36;

public class EncapsulationTest {
    
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setEmpAge(25);
        obj.setEmpCode(42811);
        obj.setEmpName("Md. Ashraful Islam Talukder");
        System.out.println("Name: " + obj.getEmpName());
        System.out.println("Code: " + obj.getEmpCode());
        System.out.println("Age: " + obj.getEmpAge());
    }
}
