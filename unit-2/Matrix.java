/* Program - 3 */
import java.util.Scanner;
public class Matrix{
    static final int N = 3;

    void getMatrix(){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.println("Enter element : ");
                x[i][j] = sc.nextInt();
            }
        }       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x[][] = new int[N][N];
        int y[][] = new int[N][N];
        /** third matrix to store output */
        int z[][] = new int[N][N];
        
        System.out.println("Enter First Matrix : ");
        x.getMatrix(); 
        
        System.out.println("Enter Second Matrix : ");
        y.getMatrix(); 
        
        System.out.println("Sum of matrices : ");
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
               z[i][j] = x[i][j] + y[i][j];
               System.out.print("\t "+ z[i][j]);
            }
            System.out.println();
         }
        sc.close();   
    }
}
