import java.lang.*;

class Daemon extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("its daemon");
        } else {
            System.out.println("not daemon");
        }
    }

    public static void main(String[] args) {
        Daemon m = new Daemon();
        m.setDaemon(true);
        m.start();

    }
}
