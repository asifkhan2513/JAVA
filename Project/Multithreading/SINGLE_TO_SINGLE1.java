import java.lang.Runnable;
import java.lang.*;
class SINGLE_TO_SINGLE1 implements Runnable{
    public void run(){
        System.out.println("this is single to  single to by using Runnable");
    }
    public static void main(String[] args) {
    SINGLE_TO_SINGLE1  w = new SINGLE_TO_SINGLE1();
    Thread th = new Thread(w);
   th.start();
    }
    
}
