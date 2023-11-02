import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        
        int n,m;
        System.out.println(" enter any number ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
      
        m= facto(n) ;
        System.out.println(" factorial is = "+m);
        //return 0;
    }
    static int facto (int num){
        int i,fact=1;
        for(  i=1;i<=num;i++)
        fact= fact*i;
        return fact;
       
    
    }

    
}
