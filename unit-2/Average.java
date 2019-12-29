import java.util.Scanner;
interface Number{
    int Process(int x, int y);
}

class Sum implements Number{
    @Override
    public int Process(int x, int y){
        return x + y; 
    }
}

public class Average extends Sum implements Number{
    @Override
    public int Process(int x, int y) {
        return super.Process(x, y)/2; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Average avg = new Average(); 
        
        System.out.println("Enter first number ");
        int a = sc.nextInt(); 
        
        System.out.println("Enter second number ");
        int b = sc.nextInt(); 
        
        System.out.println("Average of number : " + avg.Process(a,b)); 

        sc.close();
    }
}
