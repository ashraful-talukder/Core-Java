package Class19;

public class First {
    
    public static void main(String[]args){
        String s = "Dhaka";
        s.concat(" Bangladesh");
        //s = s.concat(" Bangladesh");  this contation will work when assigning stuff will happen 
        System.out.println(s);
        
        /*
        String is immutable and StringBuffer is mutable
        */
        
        StringBuffer sb = new StringBuffer("Dhaka");
        sb.append(" Bangladesh");
        System.out.println(sb);
    }
}
