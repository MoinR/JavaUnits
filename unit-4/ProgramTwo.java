class T extends Thread{
    @Override
    public void run(){
        try{
            for(int i = 1; i <= 10; i++){
                System.out.println(getName() +" "+ i);
                sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class ProgramTwo {
    public static void main(String[] args) {
        
        // Object Instantiation 
        T t1 = new T();
        T t2 = new T();
        T t3 = new T();
        T t4 = new T();
        T t5 = new T();
        
        // Starting thread 
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
 
        // Joining threads will keep main thread in waiting state
        try{
            t1.join(); 
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Hello..!");
    }
}