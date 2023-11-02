import java.util.Scanner;

public class prime_Or_Not {
    public static void main(String[] args) {
        int num, c = 2;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while (c <= num) {
            if (num % c == 0) {
                break;
            }
            c++;

        }
        if (!flag)

            System.out.println(" number is prime number");

        else
            System.out.println(" number is  not prime ");

    }
}
