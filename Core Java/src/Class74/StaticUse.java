package Class74;

public class StaticUse {
    /**
     * an object created by a class, should access all the methods present in the class
     * so it should have the capacity to call the static methods too
     * But inside, a static method is never really called on an object instance
     * Even if the object instance points to null, it gets called
     */
    public static void main(String[] args) {
        StaticUse su = null;
        //hence this is static method we can call it any of below either way
        su.methodOne();
        StaticUse.methodOne();
        methodOne();
        //bellow will produce a NullPointerException
        su.methodTwo();
    }
    
    private static void methodOne(){
        System.out.println("method one");
    }
    
    private void methodTwo(){
        System.out.println("method two");
    }
}
