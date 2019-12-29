/* Program - 8 */
import java.util.Scanner;

interface Exam{
    boolean pass(int mark); 
}
interface Classify{
    void division(int avg); 
}

public class Result implements Exam, Classify{
    @Override
    public boolean pass(int mark){
        return (mark < 35);
    }
    @Override
    public void division(int avg){
        if(avg >= 60){
            System.out.println("Division : First");
        }
        else if(avg >= 50 && avg < 60){
            System.out.println("Division : Second ");
        }
        else{
            System.out.println("Division : No division ");
        }
    }
    public static void main(String[] args) {
        Result r = new Result();
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter marks (Out of 700) : ");
        int mark = sc.nextInt();
        int avg = mark / 7;  
        if(r.pass(mark)){
            System.out.println("Student has passed the exam ");
            r.division(avg);
        }
        
        sc.close();
    }
}