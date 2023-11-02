import java.util.Scanner;

public class palindromeString {
    public  static  boolean checkPalindrome(String s){
        String d = s.toLowerCase().trim();
        StringBuilder str = new StringBuilder(d);

//        String st= str.reverse().toString();
        if(d.equals(str.reverse().toString())){

            return  true;

        }
        else {
            return  false;
        }
    }
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println(checkPalindrome(s));
    }
}
