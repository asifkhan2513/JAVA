import java.math.BigInteger;
import java.util.Scanner;

public class factorialBigInteger {


    static BigInteger BigInt(int x){
        BigInteger b = new BigInteger(String.valueOf(x));
        BigInteger fact = new BigInteger("1");
        if (x == 0){
            return fact;
        }
       else {
            return  b.multiply(BigInt(x- 1));
        }
//       return fact;
    }
    public static void main(String[] args) {
        System.out.println("Enter Any number");
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println( BigInt( x));
    }
}
