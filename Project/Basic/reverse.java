import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int original, rem,rev = 0;
        Scanner sc = new Scanner(System.in);
        original = sc.nextInt();
        while(original!=0){
            rem = original%10;
            rev = rev * 10+rem;
            original = original/10;

        }
        System.out.println(rev);

    }
}
