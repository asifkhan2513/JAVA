import java.math.BigInteger;
import java.util.Scanner;

public class fibonacci_nth_series {

    static BigInteger fibo(int x){
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger  c = new BigInteger("1");
        for (int i = 2 ; i <=x ; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return  c;
    }
    public static void main(String[] args) {
        int x ;
        System.out.println("enter Any number");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println( fibo( x ));
    }
}
