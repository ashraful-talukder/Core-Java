package Class34;

public class VarArgs {

    public static void main(String[] args) {
        test(215, "Dhaka", "Khulna");
        test(147, "United States", "New York", "California");
    }

    public static void test(int some, String... args) {
        System.out.print("\n" + some);
        /**
         * Enhanced for loop
         */
        for (String arg : args) {
            System.out.print(", " + arg);
        }
    }
}
