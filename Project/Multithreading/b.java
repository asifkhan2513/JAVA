import java.lang.*; 
// import java.lang.Thread;
class b implements Runnable{
    public void run(){
        System.out.println(" my name is asif");
    }
    public static void main(String[] args) {
        b  t = new b();
        Thread th = new Thread(t);
        th.start();
        // th.start();
        th.run();
    }
}
