import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
      int orig , save,rem=0,rev;

        Scanner sc = new Scanner(System.in);
        orig = sc.nextInt();
        save= orig;
        while(orig!=0)
        {
            rev= orig%10;
            rem = rem *10+rev;
            orig= orig/10;

        }
        if(rem == save){
            System.out.println("This is palindrome number ");
        }
        else {
            System.out.println("This is not palindrome number");
        }
    }
}
