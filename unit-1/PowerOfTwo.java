public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 2; 
        int tmp; 
        for(int i = 0; i <= 10; i++){
            tmp = n << i ; 
            System.out.println(tmp);
        }
    }
}