import java.lang.*;
class SINGLE_TO_MULTIPLE1 extends Thread{
    public void run(){
        System.out.println("this single to multiple by using  runnable state");
    }
public static void main(String[] args) {
    SINGLE_TO_MULTIPLE1 y = new SINGLE_TO_MULTIPLE1();
    Thread yt = new Thread(y);
    yt.start();
}
}
