import java.lang.*;
class sleep1  extends Thread{
    public void run (){
        for(int i =1 ;i<=10;i++){
            try{
                Thread.sleep(1000);
            }

            
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }



    public static void main(String[] args) {
        sleep1 t = new sleep1();
        t.start();
    }
}






