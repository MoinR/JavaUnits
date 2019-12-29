/* Program - 4 */
import java.util.Scanner;
public class MinQuote {
    static final int N = 3; 
    public static void main(String[] args) {
        String company[] = new String[N]; 
        int quotedAmt[] = new int[N]; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter comapany details : ");
        for(int i = 0; i < N; i++){
            System.out.println("Enter company name : ");
            company[i] = sc.nextLine();     
            System.out.println("Enter company's quoted amount : ");
            quotedAmt[i] = sc.nextInt();
                 
            // for enter key handling 
            sc.nextLine(); 
        }
        
        // for storing index of min item 
        int index = 0; 
        // finding min item; 
         
        for(int i = 0; i < N; i++){
            if(quotedAmt[i] < quotedAmt[index]){
                index = i;
            }
        }
        System.out.println("Company which has quoted lowest amount : ");
        System.out.println("Company name : " +company[index]);
        System.out.println("Quoted amount : " +quotedAmt[index]);
                
        sc.close();
    }
}