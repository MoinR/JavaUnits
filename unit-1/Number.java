/*
 * Write a java program to scan 3 integer values from the command line argument
   and display the maximum number using conditional operator.
 * Compile class by : javac Number.java
 * Run class By : java Number 10 25 36
 */
public class Number {
    static int max(final int a, final int b, final int c){
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c) ; 
    }
    public static void main(final String[] args) {
        System.out.println("Maximum number : " + max(Integer.parseInt(args[0]), Integer.parseInt(args[1]),Integer.parseInt(args[2])));
    }
}
