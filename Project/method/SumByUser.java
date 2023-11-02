import java.util.Scanner;

public class SumByUser {
    public static void d(int x, int y){
        int z;
        z= x+y;
        System.out.println(" the sum = "+ z);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        int a,b;
        System.out.println(" enter two number = ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
    SumByUser g= new SumByUser();
        g.d(a, b);
    }
}

