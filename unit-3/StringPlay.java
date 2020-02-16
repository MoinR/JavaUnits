import java.util.Scanner;
public class StringPlay {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        String s = new String(); 
        int upprs = 0; 
        
        System.out.println("Enter string : ");
        s = sc.nextLine(); 
        
        // Creating string buffer from the string given by user 
        StringBuffer sb = new StringBuffer(s); 
       
        System.out.println("\nDisplaying in reverse -");
        
        sb.reverse(); 
        for(int i = 0; i < sb.length(); i++){
            System.out.println(sb.charAt(i));
        }
        
        System.out.println("\nNumber of characters : " + sb.length()); 
        for(int i = sb.length()-1; i > -1; i--){
            System.out.println(s.charAt(i) + " is on " + (i+1) + " position" );
        }

        if(s.equalsIgnoreCase(sb.toString())){
            System.out.println("\nPalindrom string ");
        }
        else{
            System.out.println("\nNot a palindrom string " ); 
        }
        
        /* Counting uppercase and lowercase letters */
        for(int i = 0; i < sb.length(); i++){
            if( Character.isUpperCase(sb.charAt(i)) ){
                upprs++; 
            }
        }
        System.out.println("\nTotal Uppercase letters : " + upprs);
        System.out.println("Total Lowercase letters : " + (sb.length() - upprs));

        sc.close();
    }
}
