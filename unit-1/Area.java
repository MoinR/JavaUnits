import java.util.Scanner;
public class Area{
    
    private static void calc(int a){
        System.out.println("Area of square : " + a*a);
    }
    private static void calc(int a,int b){
        System.out.println("Area of rectangle : " + a * b);        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a,b; 

        System.out.println("What you want to find : ");
        System.out.println("1. Area of rectangle ");
        System.out.println("2. Area of square ");

        System.out.println("Enter choice : ");
        int ch = sc.nextInt();

        if(ch == 1){
            System.out.println("Enter length : ");
            a = sc.nextInt();
            
            System.out.println("Enter bredth : ");
            b = sc.nextInt();
            
            calc(a,b);
        }
        else if(ch == 2){
            System.out.println("Enter length : ");
            a = sc.nextInt();
            calc(a);
        }
        else{
            System.out.println("Invalid choice..!");
        }

    }
}