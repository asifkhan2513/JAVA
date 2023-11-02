import java.lang.*;
import java.lang.Exception;
class Sleep {
    public static void main(String[] args) {
        System.out.println("Table of  10 is ");
        for(int i=1;i<=10;i++){
            try{
                Thread.sleep(1000);

                System.out.println("10 * " +i+ " = "+10*i);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
