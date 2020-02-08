public class ProgramThree implements Runnable {

    int x, y; 
    static int sum; 
    static float avg; 

    public ProgramThree(){ }

    public ProgramThree(int x, int y){
        this.x = x; 
        this.y = y; 
    }
    
    public void start(){
        run();
    }

    @Override
    public void run(){ 
        try{
            for(int i = x; i < y; i++){
                sum = sum + i;
                Thread.sleep(100);
            }
            int n = y - x;   
            avg = sum / n;
            System.out.println("Sum = "+sum + "\nAvg = "+avg);

        }catch(InterruptedException e){
            System.out.println(e);
        } 
    }
    public static void main(String[] args) {
        ProgramThree t1 = new ProgramThree(1, 10); 
        ProgramThree t2 = new ProgramThree(11, 20); 

        t1.start(); 
        t2.start(); 

        System.out.println("Task completed");
    }
}