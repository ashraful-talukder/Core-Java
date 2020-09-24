package Class20;

public class PrimitiveCast {
    public static void main(String[]args){
        /*
        Cross Casting
        this means class type to primitive type
        or primitive type to class type
        */
        String s = "13";
        int stoi = Integer.parseInt(s);
        //stoi = Integer.valueOf(s).intValue();  this is an another method
        System.out.println("String to int: " + stoi);
        
        int i = 14;
        String itos = Integer.toString(i);
        System.out.println("int to String: " + itos);
        
        String ss = "13";
        double stod = Double.valueOf(ss).doubleValue();
        System.out.println("String to Double: " + stod);
        
        double d = 13.5d;
        String dtos = Double.toString(d);
        System.out.println("Double to String: " + dtos);
        
        
        /*
        Primitive casting
        this means primitive to primitive casting
        */
        char c = 'a';
        int ctoi = c; //no need to explicit cast
        System.out.println("char to int: " + ctoi);
        
        int ii = 97;
        char itoc = (char)ii; //narrowing
        System.out.println("int to char: "+itoc);
        
        /*
        Cross casting
        */
        String sss = "Welcome";
        char stoc = (char)sss.charAt(0);
        System.out.println("String to Character: " + stoc);
        
        char cc = 'X';
        System.out.println("Character to String: " + String.valueOf(cc));
        
        /*
        int to double-widening
        */
        int iii = 5;
        double itod = iii;
        System.out.println("int to double: " + itod);
        
        /*
        double to int-narrowing
        */
        double dd = 5.4d;
        int dtoi = (int)dd;
        System.out.println("double to int: " + dtoi);
    }
}

