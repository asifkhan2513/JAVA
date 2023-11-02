import org.w3c.dom.ls.LSOutput;

public class swapNumbers {
    public static void main(String[] args) {
        // method 1

        int x=5;
        int y=10;

           x=y;
           y=x-y;
        System.out.println("the value of x = " +x +"the value of = "+ y);




        // method 2

        int m=5,n=10;
        int temp;
        temp = m;
        m= n;
        n = temp;
        System.out.println("the value of m = "+ m +"the value of n is = "+n);
    }



}
