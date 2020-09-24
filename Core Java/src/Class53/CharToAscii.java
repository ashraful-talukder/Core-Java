package Class53;

public class CharToAscii {
    
    public static void main(String[] args) {
        char[] alphabets = {'q', 'e', 'd', 'f', 'j', 't', 'A', 'i', 'B', 'K', 'O', 'E', 'M', 'H', 'J', 'A', 'C', 'F', 'G', 'I'};
        
        for(int i = 0; i < 20; i++){
            char c = alphabets[i];
            System.out.println(c + " = " + (int)c);
        }
    }
}
