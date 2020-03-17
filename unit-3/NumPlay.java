/*Write a Java program to input n integer numbers and display lowest and second
5 lowest number. Also handle the different exceptions possible to be thrown
during execution.  */
import java.util.InputMismatchException;
import java.util.Scanner;
public class NumPlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter N : ");
        int n = sc.nextInt(); 
        int num[] = new int[n]; 

        try{
            for(int i = 0; i < num.length; i++){
                System.out.println("Enter number : ");
                num[i] = sc.nextInt(); 
            }
        }
        catch(InputMismatchException i){
            System.out.println("Invalid number entered ");
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Number of values are not in limit ");
        }
        catch(Exception e  ){
            System.err.println("Exception occurred : "+ e.getMessage()); 
        }
        sc.close(); 
    }
}
