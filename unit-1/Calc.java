import java.util.Scanner;

public class Calc{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Principle : ");  
        int p = sc.nextInt();
        
        System.out.println("Enter Number of years : ");  
        float n = sc.nextFloat();
        
        System.out.println("Enter rate of interest  : ");  
        float r = sc.nextFloat();
        
        float i = (p*r*n)/100;

        System.out.println("Simple Interest : " + i);
        sc.close(); 
    }
}