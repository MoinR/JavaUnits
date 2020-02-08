package PackB; 
public class B  {
     public void show(){
        PackA.A.show(); 
        System.out.println("Class B called ..! \n Value of instance variable : "+PackA.A.data );
     }
}