import java.util.Scanner;
public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Items available : ");
        System.out.println("1. Seat covers ");
        System.out.println("2. Steering wheel covers ");
        System.out.println("3. Car Lighting  ");
        System.out.println("4. Air purifiers  ");
        System.out.println("5. Other  ");
        
        System.out.println("Select any item that customer wants to buy : ");
        int ch = sc.nextInt();

        int price,qty; 
        float total = 0; 
        
        switch(ch){
            case 1:
                price = 500; 
        
                System.out.println("You have selected seat covers");
                System.out.println("Price : " + price);
                System.out.println("How many seat covers would you like to buy : ");
                qty = sc.nextInt();
                
                total += price * qty; 
                total += (total * 2)/100;
                break; 
        
            case 2:
                price = 200; 

                System.out.println("You have selected Steering wheel covers");
                System.out.println("Price : " + price);
                System.out.println("How many  Steering wheel covers would you like to buy : ");
                qty = sc.nextInt();

                total += price * qty; 
                total += (total * qty * 3)/100;
                break;

            case 3:
                price = 200; 

                System.out.println("You have selected Lights");
                System.out.println("Price : " + price);
                System.out.println("How many Lights would you like to buy : ");
                qty = sc.nextInt();
                
                total += price * qty; 
                total += (total * 4)/100;
                break;
            case 4: 
                price = 230; 

                System.out.println("You have selected Air purifiers ");
                System.out.println("Price : " + price);
                System.out.println("How many Air purifiers would you like to buy : ");
                qty = sc.nextInt();
                
                total += price;
                total = (total * (float)2.5)/100;
                break;
                
            case 5:
                System.out.println("Enter price of item : ");
                price = sc.nextInt(); 

                System.out.println("You have selected Air purifiers ");
                System.out.println("Price : " + price);
                System.out.println("How many Air purifiers would you like to buy : ");
                qty = sc.nextInt();
                
                total += price;
                total = (total * (float)2.5)/100;
                break;
        }
        
        System.out.println("Total amount to be paid : " + total);        
        System.out.println("Thank you ! ");
        sc.close();
    }
}