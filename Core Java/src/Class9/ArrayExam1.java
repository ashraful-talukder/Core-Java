package Class9;

import java.util.Arrays;

public class ArrayExam1 {
    
    public static void main(String[]args){
        int a[] = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        
        int num[] = {50, 300, 4, 83 ,45, 43};
        int m = num.length;
        System.out.print("Given number: ");
        for(int i = 0; i < m; i++){
            System.out.print(num[i] + " ");
        }
        
        System.out.print("\nAccending order number: ");
        Arrays.sort(num);
        for(int i = 0; i < m; i++ ){
            System.out.print(num[i] + " ");
        }
    }
}
