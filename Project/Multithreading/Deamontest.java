import java.lang.*;
class Deamontest extends Thread {
    public void run(){
        System.out.println("name : "+Thread.currentThread().getName());
        System.out.println("Deamon"+Thread.currentThread().isDaemon());
 
    }
    public static void main(String[] args) {
        
    }
}
