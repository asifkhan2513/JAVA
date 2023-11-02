import java.lang.*;
class Medical extends Thread {
    public void run(){
      try{
          System.out.println("Your Medical Test Is Start");
          Thread.sleep(1000);
          System.out.println("Medical  Test is completed");
          Thread.sleep(1000);
          System.out.println("-----------------------------\n");
          Thread.sleep(1000);
          Thread.sleep(1000);
        }
        catch(Exception e)
        {
          System.out.println(e);
        }
    }     
}
class InterView extends Thread{
    public  void run(){
        try {
             System.out.println("Interview start");
             Thread.sleep(1000);
             System.out.println("Interview complete");
             Thread.sleep(1000);
             System.out.println("-----------------------------\n");
             Thread.sleep(1000);
            
            }  catch (Exception e) {
               System.out.println(e);
              }
        }
}
class PolicEnquary extends Thread{
    public void run(){
        try {
         System.out.println("visit your  nearest police  station ");
         Thread.sleep(1000);
         System.out.println("Give simple Question Answer");
         Thread.sleep(1000);
         System.out.println("Your passport process is complete");
         System.out.println("-----------------------------\n");
         Thread.sleep(1000);
        } catch (Exception e) {          
            System.out.println(e);
        }
    }
}
class  Compelete extends Thread {
    public void run(){
        try {
            System.out.println("PassPort is  generated successfully");
            Thread.sleep(1000);
            System.out.println("It Will delivered ASAP ");
            Thread.sleep(1000);
            System.out.println("if any case  delay in  delivered it will  be take  10 to 15 day");
            System.out.println("----------Please wait-------\n ");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class PassPosrtSystem {
    public static void main(String[] args) throws InterruptedException {
        Medical m =new Medical();
        m.start();
        m.join();

        InterView  i = new  InterView();
        i.start();
        i.join();

        PolicEnquary p =  new PolicEnquary();
        p.start();
        p.join();

        Compelete c = new Compelete();
        c.start();
    }
}