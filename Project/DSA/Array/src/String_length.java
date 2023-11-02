import java.util.Scanner;

public class String_length {
    public  static  int getLength(char name[]){
        int count =0 ;
        for (int i = 0 ;i<name.length;i++){
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
//        var i = 10;
        char name[];


        System.out.println("Enter Any String");
        Scanner sc = new Scanner(System.in);
        name = sc.next().toCharArray();
        System.out.println("The length of the given value is : " + getLength(name));

    }
}
