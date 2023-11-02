import java.lang.*;

class SetName_getName extends Thread {
    public void run() {
        // Thread.currentThread().setName("Asif ");
        System.out.println("RUNNING : " +Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("Hello : " + Thread.currentThread().getName());
        SetName_getName t1 = new SetName_getName();
        t1.setName("asif");
        t1.start();
        SetName_getName t2 = new SetName_getName();
        t2.setName("Thanos");
        t2.start();       
        
    }
}
