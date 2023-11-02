import java.util.Scanner;

public class leapf {
    public static void main(String[] args) {
        int n;
        System.out.println(" enter any year:");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        f(n);

    }
    static void f(int a){
        if(a%4==0||a%100==0){
            System.out.println("its a leap year");
        }
        else{
            System.out.println(" its not a leap year");
        }
    }
}
