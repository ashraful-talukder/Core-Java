package Class19;

public class Concat {
    /*
    String is used to manipulate  character strings that cannot be changed (read-only and immutable)
    StringBuffer is used to represent characters that can be modified.
    Performance wise, StringBuffer is faster when performing concatenations.
    This is  because when you concatenate a String, you are creating a new object (internally) every time since String is immutable.
    */
    
    public static String concatWithString(){
        String t = "Cat";
        for(int i = 0; i < 100000; i++){
            t.concat("Dog");
        }
        return t;
    }
    
    public static String concatWithStringBuffer(){
        StringBuffer sb = new StringBuffer("Cat");
        for(int i = 0; i < 100000 ; i++){
            sb.append("Dog");
        }
        return sb.toString();
    }
    
    public static String concatWithStringBuilder(){
        StringBuilder sb = new StringBuilder("Cat");
        for (int i = 0; i < 100000; i++){
            sb.append("Dog");
        }
        return sb.toString();
    }
    
    public static void main(String[]args){
        long start = System.currentTimeMillis();
        concatWithString();
        System.out.println("Concate with String took " + (System.currentTimeMillis() - start) + "ms");
        start = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Concate with StringBuffer took " + (System.currentTimeMillis() - start) + "ms");
        start = System.currentTimeMillis();
        concatWithStringBuilder();
        System.out.println("Concate with StringBuilder took " + (System.currentTimeMillis() - start) + "ms");
    }
}
