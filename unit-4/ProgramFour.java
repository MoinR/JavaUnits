public class ProgramFour implements Runnable {

    int n;
    String msg;  

    public ProgramFour(){ }

    public ProgramFour(int x, String m){
        n = x; 
        msg = m; 
   }
    
    public void start(){
        run();
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
        ProgramFour p1 = new ProgramFour(4, "Fybca"); 
        ProgramFour p2 = new ProgramFour(6, "Sybca"); 
        // ProgramFour p; 
        int a[] = new int[10];
        a[0] = 5;
        System.out.println(a[11]);

        Thread t1 = new Thread(p1); 
        Thread t2 = new Thread(p2); 

        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start(); 
        t2.start(); 

        try{
            t1.join(); 
            t2.join(); 
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("TYBCA");
    }
}