import java.util.Scanner;
class NumberData{
    static final int N = 5; 
    static int arr[] = new int[N]; 
    public void getNum(){
        Scanner sc = new Scanner(System.in); 
        for(int i : arr ){
            System.out.println("Enter number : ");
            i = sc.nextInt(); 
        }
        sc.close();
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
        int max = 0; 
        for(int i = 0; i < N; i++){
            if(max > arr[i]){
                max = arr[i]; 
            }
        }
        return max; 
    }
    public int minNum(){
        int min = 0; 
        for(int i = 0; i < N; i++){
            if(min < arr[i]){
                min = arr[i]; 
            }
        }
        return min; 
    }
}
public class NumProgram{
    public static void main(String[] args) {
        NumPlay n = new NumPlay(); 
        
    }
}