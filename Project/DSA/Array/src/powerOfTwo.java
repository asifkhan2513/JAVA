import java.util.Scanner;

public class powerOfTwo {
    static int power(int n){
        if (n == 0){
            return 1;
        }
        else {
            return  2 *power(n-1);
        }

    }

    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(power(n));
    }
}
