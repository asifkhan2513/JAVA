import java.util.Scanner;

class Lrgest_Of_three_number{
    public static void main(String[] args) {
        int a , b ,c;
        Scanner sc = new Scanner (System.in);
        a=sc.nextInt();
        b= sc.nextInt();
        c = sc.nextInt();
        int anns1 = Math.max(a, b);
        int ans= Math.max(anns1, c);
        System.out.println("the large number will be "+ ans);
    }
}