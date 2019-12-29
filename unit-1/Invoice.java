import java.util.Scanner;

/*
A shop during festival season offers a

discount 10% for purchase made up to Rs.1,000,
12% for purchase value of Rs.1,000 or more up to Rs 1,500
and 15% for purchase value of Rs.1,500 or more.

Write a program to implement the above scheme for a given sales and print out the sales and print out the sales value, discount and net amount
payable by a customer. Create necessary methods and constructors.
 */
public class Invoice {
    static int purchase;   
    static float discount;
    static float amt;
    
    public Invoice(){
        purchase = 0;
        discount = 0;
        amt = 0;
    }
    public static float calculate_discount(int price){
        if(price < 1000)
            return ((price * 10)/100);

        else if(price <= 1000 && price < 1500)
            return ((price * 12)/100);
        
        else if(price >= 1500)
            return ((price * 15)/100);
        else
            return (float)0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter amount of Purchase : ");
        purchase = sc.nextInt();
        
        System.out.println("Sales : " + purchase);
        System.out.println("Discount : " + calculate_discount(purchase));
        System.out.println("Total amount to be paid : " + (purchase - calculate_discount(purchase)));
    }

}