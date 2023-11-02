import java.lang.*;
class SINGLE_TO_SINGLE extends Thread{
    public void run(){
        System.out.println(" this is ingle task to single");
    }
    public static void main(String[] args) {
        SINGLE_TO_SINGLE y = new SINGLE_TO_SINGLE();
        y.start();
    }
}
