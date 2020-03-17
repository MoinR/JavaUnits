/* Write an application that accepts marks of three different subject from user.
Marks should be between 0 to 100, if marks of any of the subject is not belong
to this range, generate custom exception out of RangeException. If marks of
each subjects are greater than or equal to 40 then display message “PASS” along
with percentage, otherwise display message “FAIL”. Also write exception
handling code to catch all the possible runtime exceptions likely to be generated
in the program. */
import java.util.InputMismatchException;
import java.util.Scanner;

class MarksOutOfRange extends Exception{
    public MarksOutOfRange(){
        
    }
    public MarksOutOfRange(String msg){
        super(msg); 
    }
}
public class Result {
    int marks[] = new int[3];

    void getMarks() throws MarksOutOfRange{
        Scanner sc = new Scanner (System.in); 
        for(int i = 0; i < marks.length; i++){
            System.out.println("Enter Marks : ");
            marks[i] = sc.nextInt(); 
            if(marks[i] > 100 || marks[i] < 0){
                throw new MarksOutOfRange("Marks out of range: Marks should be in range of 0 - 100"); 
            }
        }
        sc.close(); 
    } 
    
    void showResult(){
        int sum = 0; 
        boolean failed = false; 
        for(int i : marks){
            if(i >= 40){
                sum += i; 
            }
            else{
                failed = true; 
            }
        }
        if(!failed){
            System.out.println("PASSED EXAM WITH : " + sum/3 + "%");
        }
        else{
            System.out.println("FAIL ");
        }
    }

    public static void main(String[] args) {
        Result r = new Result(); 
        try{
            r.getMarks();
            r.showResult();
        }
        catch(MarksOutOfRange m){
            System.err.println(m.getMessage());
        }
        catch(InputMismatchException i){
            System.err.println("Incorrectly entered marks (Should be in integer)");
        }
        catch(ArrayIndexOutOfBoundsException a ){
            System.err.println("Error occurred ");
        }
        
    }
}