/* Create class calculation with an abstract method area( ). Create Rectangle and
9 Triangle subclasses of calculation and find area of rectangle and triangle.*/

abstract class Calculation{
    abstract void area(int x, int y); 
}
class Rectangle extends Calculation{
    @Override
    public void area(int length, int breadth ){
        System.out.println("Area of Rectangle : " + length * breadth);
    }
}
class Triangle extends Calculation{
    @Override
    public void area(int base, int height){
        System.out.println("Area of triangle : " + (base * height) / 2);
    }
}

public class AreaCalc {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(); 
        r.area(5, 10);

        Triangle t = new Triangle(); 
        t.area(10,15);
    }    
}