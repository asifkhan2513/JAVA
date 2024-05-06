import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        int a ,b,c,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the one by one \n");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sum =calSum(a,b,c);
        System.out.println(" the is "+sum);
        // sum =calSum(a,b,c);
        // System.out.println(" the is "+sum);

    }
    static int calSum(int x,int y,int z){
        int d;
        d=x+y+z;
        return d;
    }
    
}
