import java.util.Scanner;
public class Loan{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter amount : ");
        float amount = sc.nextFloat();

        float emi = amount / 60; 
        
        System.out.println("EMI : " + emi + " Rs.");
        
        sc.close();
    }
}