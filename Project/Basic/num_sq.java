import java.util.Scanner;

class num_sq{
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the base value ");
        a = sc.nextDouble();
        System.out.println("Enter the power value ");
        b = sc.nextDouble();
        double m = Math.pow(a,b);
        System.out.println("The square of both number is =" +m);

    }
}