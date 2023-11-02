import java.util.Scanner;

public class fabonacci{
    public static void main(String[] args) {
        int n,m;
        System.out.println("enter the series number");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
       m= fib(n);
        System.out.println(" he series is "+m);
    }
    static int fib(int n)WWWWWWWWWWWWWW
    
        
        if (n <= 1)
            return n;
            else{
                 return fib(n - 1) + fib(n - 2);
            }
       
    }

        
    }

