package Class23;

public class ValueOf {
    
    public static void main(String[]args){
        Integer intWrapper = Integer.valueOf("12345");
        Integer intWrapper2 = Integer.valueOf("11011",2);
        Integer intWrapper3 = Integer.valueOf("D", 16);
        
        System.out.println("Value of intWrapper object: " + intWrapper);
        System.out.println("Value of intWrapper2 object: " + intWrapper2);
        System.out.println("Value of intWrapper3 object: " + intWrapper3);
        
        System.out.println("Hex value of intWrapper: " + Integer.toHexString(intWrapper));
        System.out.println("Binary value of intWrapper2: " + Integer.toBinaryString(intWrapper2)); 
    }
}
