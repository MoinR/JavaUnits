abstract class Calculation{
    abstract void area(); 
}
class Rectangle extends Calculation{
    @Override
    public void area(){
        System.out.println("");
    }
}
class Triangle extends Calculation{
    @Override
    public void area(){
        
    }
}

public class AreaCalc {
}