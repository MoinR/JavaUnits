/* Write a program that takes a string from the user and validate it. The string
6 should be at least 5 characters and should contain at least one digit. Display an
appropriate valid message. */

import java.util.Scanner;

public class ValidateStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String s;

        System.out.println("Enter string : ");
        s = sc.nextLine();  
        
        if(s.length() >= 5){
            if(s.matches(".*[0-9]+.*")){
                System.out.println("String is valid");
            }
            else{
                System.err.println("String should have at least one character ");
            }
        }
        else{
            System.out.println("Invalid string : \nString should have 5 characters\nString should have at least one character");
        }
        sc.close(); 

    }
}