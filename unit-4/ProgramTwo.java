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
        T x[] = new T[5];
        
        // Starting thread 
        for(int i = 1; i < 5; i++){
           x[i] = new T(); 
           x[i].start(); 
        }

        // Joining threads will keep main thread in waiting state
        try{
            for(int i = 1; i < 5; i++){
                x[i].join(); ;            
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Hello..!");
    }
}
