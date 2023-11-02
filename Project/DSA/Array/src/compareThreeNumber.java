import java.util.Scanner;
import java.util.*;

public class compareThreeNumber {
    public static void main(String[] args) {


    Scanner sc = new  Scanner(System.in);
     int a =sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();

        // define function
        int Large = max(a, max(b,c));
        System.out.println("\na = " + a + "\tb =" +b + "\tc = " + c );
        System.out.println("The large number is " + Large);
        }
   public static int max (int x, int y){

        return x>y?x:y;
    }
}
