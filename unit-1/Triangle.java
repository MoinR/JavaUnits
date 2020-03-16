import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x,y;
        double hypo;
        
        System.out.println("Enter first side : ");
        x = sc.nextInt();

        System.out.println("Enter second side : ");
        y = sc.nextInt();

        hypo = Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
        System.out.println("Hypotenuse : " + hypo);
        
        sc.close();
    }
}Z