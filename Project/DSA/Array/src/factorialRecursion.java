import java.util.Scanner;

public class factorialRecursion {
    static int factorial(int m ){
        if (m == 0 || m ==1){
            return 1;

        }
        else {
            return m * factorial(m-1);
        }

    }
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println(factorial(a));

    }
}
