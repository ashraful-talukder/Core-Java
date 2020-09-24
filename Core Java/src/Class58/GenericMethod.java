package Class58;

public class GenericMethod {
    
    /**
     * Generic Type method
     */
    public static <E> void printArray(E[] inputArray){
        for (E element: inputArray){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        //Create arrays of Integer, Double and Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'A', 'N', 'T', 'R', 'O'};
        
        System.out.println("Array integerArray contains: ");
        printArray(intArray);
        
        System.out.println("\nArray doubleArray contains: ");
        printArray(doubleArray);
        
        System.out.println("\nArray characterArray contains: ");
        printArray(charArray);
    }
}
