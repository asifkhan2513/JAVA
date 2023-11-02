import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {

        System.out.println("Enter any string ");
        Scanner sc = new Scanner (System.in);
        String a = sc.next();
        String b = "";
        int ptr = a.length()-1;
        while (ptr>=0){
            b = b+a.charAt(ptr);
            ptr--;
        }
        System.out.println(b);
    }
}



