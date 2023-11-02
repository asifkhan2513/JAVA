import java.lang.*;
class Daemon_threading extends Thread{
    public void run(){
        System.out.println(" this is child");
    }
    public static void main(String[] args) {
         System.out.println(" Main thread");
        Daemon_threading  t = new Daemon_threading();
        t.setDaemon(true);
        t.start();
    }
}
