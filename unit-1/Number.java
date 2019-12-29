/** 
 * Compile class by : javac Number.java
 * Run class By : java Number 10 25 36
 */
public class Number {
    static int max(int a, int b, int c){
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c) ; 
    }
    public static void main(String[] args) {
        System.out.println("Maximum number : " + max(Integer.parseInt(args[0]), Integer.parseInt(args[1]),Integer.parseInt(args[2])));
    }
}
