class T extends Thread{
    int x,y; 
    public T(){

    }
    // Contstructor 
    public T(int a,int b){
        x = a; 
        y = b; 
    }

    @Override
    public void run(){
        try{
            for(int i = x; i <= y; i++){
                if(getName() == "Even"){
                    if(i % 2 == 0){
                        System.out.println("Even Number " +i);
                        sleep(300);
                    }       
                }else{
                    if(i % 2 != 0){
                        System.out.println("ODD Number : " + i);
                        sleep(300);
                    }
                }
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class ProgramOne {
    public static void main(String[] args) {
        
        // Object Instantiation 
        T t1 = new T(1,10);
        T t2 = new T(1,10);
        
        t1.setName("Odd"); 
        t2.setName("Even"); 

        // thread main()  total 3 
        t1.start();
        t2.start();

        // Joining threads will keep main thread in waiting state
        try{
            t1.join(); 
            t2.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Both the threads are completed ");

        
    }
}