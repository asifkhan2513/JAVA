import java.lang.*;
class SINGLE_TO_MULTIPLE extends Thread{
    public void run(){
        System.out.println(" this is single to multiple");
    }
    public static void main(String[] args) {
        SINGLE_TO_MULTIPLE  y = new SINGLE_TO_MULTIPLE();
        y.start();
    }
}
