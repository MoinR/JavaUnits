/* Program - 6  */
import java.util.Scanner;
class NumberData{
    static final int N = 5; 
    static int arr[] = new int[N]; 
    public void getNum(){
        Scanner sc = new Scanner(System.in); 
        for(int i = 0; i < N; i++ ){
            System.out.println("Enter number : ");
            arr[i] = sc.nextInt(); 
        }
    }
    
}
class NumPlay extends NumberData{
    public void display(){
        for(int i : arr ){
            System.out.println(i);
        }   
    }
    public int sum(){
        int _sum = 0; 
        for(int i = 0; i < N; i++){
            _sum += arr[i]; 
        }
        return _sum; 
    }
    public float numAvg(){
        float avg = this.sum() / N; 
        return avg; 
    }
    public int maxNum(){
        int max = arr[0]; 
        for(int i = 0; i < N; i++){
            if(max < arr[i]){
                max = arr[i]; 
            }
        }
        return max; 
    }
    public int minNum(){
        int min = arr[0]; 
        for(int i = 0; i < N; i++){
            if(min > arr[i]){
                min = arr[i]; 
            }
        }
        return min; 
    }
}
public class NumProgram{
    public static void main(String[] args) {
        NumPlay n = new NumPlay(); 
        Scanner s = new Scanner(System.in); 
        int ch = 0; // choice 
        
        System.out.println("Enter 5 number : ");
        n.getNum();
        
        do{
            System.out.println("1. Display numbers entered.");
            System.out.println("2. Sum of the number");
            System.out.println("3. Average of the numbers.");
            System.out.println("4. Maximum of the numbers");
            System.out.println("5. Minimum of the numbers.");
            System.out.println("6. Exit ");
            System.out.println("Enter your choice ");
            ch = s.nextInt(); 
            if(ch == 1){
                n.display();        
            }
            else if(ch == 2){
                System.out.println("Sum of array : " + n.sum());
            }
            else if(ch == 3){
                System.out.println("Average of array : " + n.numAvg());
            }
            else if(ch == 4){
                System.out.println("Maximum of array : " + n.maxNum());
            }
            else if(ch == 5){
                System.out.println("Minimum of array : " + n.minNum());
            }
            else{
                System.out.println("Thank you user !");
            } 
            
        }
        while(ch != 6); 
        s.close(); 
        
    }
}