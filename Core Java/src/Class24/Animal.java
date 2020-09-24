package Class24;

public interface Animal {
    //methods implicitly public abstract
    void eat();
    
    public abstract void travel();  //if we mention public and abstract it won't make any problem
    
    //variable implicitly public static final
    int x = 100;
}
