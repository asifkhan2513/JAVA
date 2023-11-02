import java.lang.*;

class MULTIPLE_TO_MULTIPLE0 extends Thread {
    public void run() {
        System.out.println(" this is one ");
    }
}

class MULTIPLE_TO_MULTIPLE1 extends Thread {
    public void run() {
        System.out.println(" this is two ");
    }
}

class MULTIPLE_TO_MULTIPLE2 extends Thread {
    public void run() {
        System.out.println(" this is three ");
    }
}
class MULTIPLE_TO_MULTIPLE{
    public static void main(String[] args) {
        MULTIPLE_TO_MULTIPLE0 y = new MULTIPLE_TO_MULTIPLE0();
        y.start();
        MULTIPLE_TO_MULTIPLE1 m = new MULTIPLE_TO_MULTIPLE1();
        m.start();
        MULTIPLE_TO_MULTIPLE2 u = new MULTIPLE_TO_MULTIPLE2();
        u.start();
        
    }
}