package Class32;

public class Enum {
    
    public enum Day{
        SAT, SUN, MON, TUE, WED, THU, FRI
    }; //semicolon is optional here
    
    public static void main(String[] args) {
        for (Day s : Day.values()){
            System.out.println(s);
        }
    }
}
