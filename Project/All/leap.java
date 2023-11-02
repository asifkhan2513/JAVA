import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        System.out.println(" enter any year name :");
        int y;
        Scanner sc = new Scanner(System.in);
        y= sc.nextInt();
        
        if(y%100==0||y%4==0){
            System.out.println("this is a leap year");

        }
        else{
            System.out.println(" this is a not leap year");
        }
    }
}
