import java.lang.*;
class Medical extends Thread{
    public void run(){
       try{
        System.out.println("Medical start");
        Thread.sleep(5000);
        System.out.println("Medical complete");
        Thread.sleep(5000);
        System.out.println("We are going our next process plz wait");
        System.out.println("-----------------------------------------");
        Thread.sleep(2000);
       }
       catch(Exception e){
        System.out.println(e);
       }
    }
}
class DriveTest extends Thread{
    public void run (){
        try{
            System.out.println("Driving test is start");
            Thread.sleep(5000);
            System.out.println("Driving test is completed ");
            Thread.sleep(5000);
            System.out.println("We are going our next process plz wait");
            System.out.println("-----------------------------------------");
             Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class OffecerSign extends Thread{
    public void run(){
        try{
            System.out.println("Officer cheking  file ");
            Thread.sleep(3000);
            System.out.println("Sign completed");
            Thread.sleep(5000);
            System.out.println("Your process is SUCCESSFULLY ");
            System.out.println("---------------------------------------");
             Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class License {
    public static void main(String[] args)  throws InterruptedException{
        Medical m = new Medical();
        m.start();
        m.join();
        DriveTest d = new DriveTest();
        d.start();
        d.join();

        OffecerSign o = new OffecerSign();
        o.start();
    }
}
