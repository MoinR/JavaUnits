/* Write an interface called numbers, with a method in Process(int x, int y). Write a
class called Sum, in which the method Process finds the sum of two numbers
5 and returns an int value. Write another class called Average, in which the
Process method finds the average of the two numbers and returns an int.*/
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

public class Average extends Sum {
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
