/* Program - 3 */
import java.util.Scanner;
public class Matrix{
    static final int N = 3;
    static Scanner sc = new Scanner(System.in);
    
    int arr[][] = new int[N][N];
    
    void getMatrix(){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.println("Enter element : ");
                arr[i][j] = sc.nextInt();
            }
        }       
    }
    

    public static void main(String[] args) {

        Matrix x = new Matrix();                 
        Matrix y = new Matrix(); 
        Matrix z = new Matrix(); 
                
        System.out.println("Enter First Matrix : ");
        x.getMatrix(); 
        
        System.out.println("Enter Second Matrix : ");
        y.getMatrix(); 
        
        System.out.println("Sum of matrices : ");
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
               z.arr[i][j] = x.arr[i][j] + y.arr[i][j];
               System.out.print("\t "+ z.arr[i][j]);
            }
            System.out.println();
         }
        sc.close();   
    }
}
