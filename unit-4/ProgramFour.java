public class ProgramFour implements Runnable {

    int n;
    String msg;  

    public ProgramFour(){ }

    public ProgramFour(int x, String m){
        n = x; 
        msg = m; 
    }
   
    @Override
    public void run(){ 
        try{
            for(int i = 0; i < n; i++){
                System.out.println(msg);
                Thread.sleep(500); 
            }
        }catch(InterruptedException e){
            System.out.println(e);
        } 
    }
    public static void main(String[] args) {
        Thread p1 = new Thread( new ProgramFour(4, "Fybca") ); 
        Thread p2 = new Thread( new ProgramFour(6, "Sybca") ); 
        
        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.MAX_PRIORITY);

        p1.start(); 
        p2.start(); 

        try{
            p1.join(); 
            p2.join(); 
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("TYBCA");
    }
}
