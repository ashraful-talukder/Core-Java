package Class18;

public class EqualCheck {
    
    public static void main(String[]args){
        String s1 = "YES";
        String s = "Y";
        String s2 = "Y"+"ES";
//        String s2 = s+"ES";
//        String s2 = new String("YES");
        
        if(s1 == s2){
            System.out.println("\"==\" operator checks object reference ");
        }
        else{
            System.out.println("s1 and s2 are not same object");
        }
        
        if(s1.equals(s2)){
            System.out.println("equals() method checks value");
        }
        else{
            System.out.println("s1 and s2 have different values");
        }
        
        String s3 = new String("YES");
        String s4 = new String("YES");
        //s3=s4;
        
        if(s3 == s4){
            System.out.println("s3 and s4 are equal");
        }
        else{
            System.out.println("s3 and s4 are not equal");
        }
    }
}
