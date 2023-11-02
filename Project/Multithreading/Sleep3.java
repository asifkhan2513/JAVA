import java.lang.*;
import java.lang.Exception;
public class Sleep3  extends Thread{
    public void run(){
        try{
            for(int i=1;i<=10;i++){
            System.out.println(i+ " : "+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
        Sleep3 t = new Sleep3();
        Sleep3 t1 = new Sleep3();

        t.start();
        t1.start();
    }
}
