package Class27;

abstract class Figure{
    double dim1;
    double dim2;
    int x = 4;

    Figure(double a, double b) {
        this.dim1 = a;
        this.dim2 = b;
    }
    
    abstract double area();
    
    void sum(){
        
    }
}

class Rectangle extends Figure{

    public Rectangle(double a, double b) {
        super(a, b);
        int d;
    }
    
    @Override
    double area(){
        System.out.println("We are now inside of Rectangle");
        return dim1 * dim2;
    }
    
}

class Triangle extends Figure{

    public Triangle(double a, double b) {
        super(a, b);
    }
    
    @Override
    double area(){
        System.out.println("We are now inside of Triangle");
        return .5 *dim1 * dim2;
    }
    
}

public class AbstractArea {
    
    public static void main(String[] args) {
        //Figure f = new Figure(10, 13); //can't possible because we can't create an abstract's object
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 6);
        Figure figref; //this is okay because no object is created
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
    }
}
