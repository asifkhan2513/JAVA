import java.io.FileInputStream;
import java.io.IOException;

public class first {
    public static void main(String[] args) {
       try {
        int a= 100, b =0;
        int c = a/b;
        System.out.println(c);
       } catch (Exception e) {
        e.printStackTrace();
        System.out.println("-----------");
        System.out.println(e);
        System.out.println("-----------");
        System.out.println(e.getMessage());
        System.out.println("-----------");
        System.out.println(e.toString());
        
       }
    }
}
