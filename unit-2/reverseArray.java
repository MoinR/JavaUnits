public class reverseArray{
    public static void main(String[] args) {
        int x[] = {50,2,85,14,48};
        System.out.println("Array in reverse order : ");          
        for(int i = x.length - 1; i > -1 ; i--)
            System.out.println(x[i]);
    }
}