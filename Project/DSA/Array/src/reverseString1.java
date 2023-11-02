import java.util.Scanner;

public class reverseString1 {
//    isReverse()
    public static String isReverse(String s){

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return new String(sb);
    }
    public static void main(String[] args) {
        String  s ;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        String res= isReverse(s);
        System.out.println(res);
    }
}
