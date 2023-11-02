import java.lang.*;
class GetPriority extends Thread {
    public void run(){
        System.out.println("This is child class : "+ Thread.currentThread().getName());
        // System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        System.out.println("main old thread : "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("main new thread : "+Thread.currentThread().getPriority());
        GetPriority t = new GetPriority();
        t.setPriority(3);
        t.start();
    }
}
