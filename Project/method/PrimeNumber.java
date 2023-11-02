import java.util.Scanner;

public class PrimeNumber {
    public static void check(double n){
        for(double i=2;i<n;i++){
            if(n%i==0){
                System.out.println(" this is prime");
            }
            else{
                System.out.println(" this is not prime");
            }
        }

    }
    public static void main(String[] args) {
        double  a;

        System.out.println(" the any number");
        Scanner sc = new Scanner(System.in);
        a= sc.nextDouble();
        PrimeNumber g= new PrimeNumber();
        g.check(a);
    }
}
