package Class35;

public class ShortCircuit {
    
    public static void main(String[] args) {
        boolean b = false;
        int x = 5;
        int y = 6;
        int m = 7;
        if((x > y) && (m > x))
            System.out.println(m);
        
        /**
         * we can assign boolean values inside the condition and this is applicable for only boolean values
         * 
         * and shortCircuit: if the first condition become false then it won't check the next condition
         * 
         * or shortCircuit: if the first condition become true then it won't check the next condition
         */
        
        System.out.println("AND Short Circuit: ");
        if( (x > y) && (b = true)){
            System.out.println(b + " : from if");
        } else {
            System.out.println(b + " : from else");
        }
        
        if( (x < y) && (b = true)){
            System.out.println(b + " : from if\n");
        } else {
            System.out.println(b + " : from else\n");
        }
        
        System.out.println("OR Short Circuit: ");
        if( (x > y) || (b = true)){
            System.out.println(b + " : from if");
        } else {
            System.out.println(b + " : from else");
        }
        
        if( (x < y) || (b = true)){
            System.out.println(b + " : from if");
        } else {
            System.out.println(b + " : from else");
        }
    }
}
