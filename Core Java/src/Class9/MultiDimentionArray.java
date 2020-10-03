package Class9;

public class MultiDimentionArray {
    
    public static void main(String[]args){
        
        /*
        while we're declaring a multidimentional array that time we must
        initialize the row number. We can initialize the column number later or
        initialize at the same statement.
        */
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[3];
        
        int arr2[][] = {{2, 3, 5}, {7, 8}, {4, 5, 6}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Representing the second array: ");
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
