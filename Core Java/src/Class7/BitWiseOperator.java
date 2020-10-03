package Class7;

public class BitWiseOperator {
    
    public static void main(String[]args){
        int a = 60; // 60 = 111100
        int b = 13; // 13 =   1101
        int c =0;
        
        /*
        '&' - and operator
        12 = 1100
        */
        c = a & b; 
        System.out.println("a & b = " + c +"    binary = " + Integer.toBinaryString(c));
        
        /*
        '|' = or operator
        61 = 111101
        */
        c = a | b; 
        System.out.println("a | b = " + c +"    binary = " + Integer.toBinaryString(c));
        
        /*
        '^' - xor operator
        49 = 110001
        */
        c = a ^ b; 
        System.out.println("a ^ b = " + c +"    binary = " + Integer.toBinaryString(c));
        
        /*
        '~' - not operator
        -60 = 1000011
        rest of the 1s' for 32 bit
        */
        c = ~ a; 
        System.out.println("~ a = " + c +"    binary = " + Integer.toBinaryString(c));
        
        /*
        '<<' - left shift operator
        240 = 11110000
        */
        c = a << 2; 
        System.out.println("a << 2 = " + c +"    binary = " + Integer.toBinaryString(c));
        
        /*
        '>>' - right shift operator
        15 = 1111
        */
        c = a >>2; 
        System.out.println("a >> 2 = " + c +"    binary = " + Integer.toBinaryString(c));
        
        /*
        '>>>' - zero field right shift
        15 = 1111
        */
        c = a >>> 2; 
        System.out.println("a >>> 2 = " + c +"    binary = " + Integer.toBinaryString(c));
    }
}
