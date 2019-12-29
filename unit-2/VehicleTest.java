/* Program - 7 */
interface Vehicle{
    void numWheels(); 
}
class Car implements Vehicle{
    @Override
    public void numWheels(){
        System.out.println("Car can have 4 wheels ");
    }
}
class Truck implements Vehicle{
    @Override
    public void numWheels(){
        System.out.println("Truck can have 6,10,12 or 18 wheels ");
    }
}
public class VehicleTest{
    public static void main(String[] args) {
        Car c = new Car();
        c.numWheels();
        Truck t = new Truck(); 
        t.numWheels();
    }
}