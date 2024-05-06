package ExpressionAndStatement;

import java.util.Scanner;

public class PosNeg {
    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("positive");
        }else if(number < 0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter Any number");
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        checkNumber(n);
    }
}
