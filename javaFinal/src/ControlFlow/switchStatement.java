package ControlFlow;

import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        System.out.println("Enter number between 1 to three ");
        Scanner sc = new Scanner(System.in);
        int switchValue = sc.nextInt();
     switch (switchValue ){
         case 1 :
             System.out.println("this is 1");
             break;
         case 2 :
             System.out.println("this is two ");
             break;
         case 3:
             System.out.println("this is three");
             break;
         default:
             System.out.println("this is invalid statement");
     }
    }

    public static class forLopDebugger {
        public static void main(String[] args) {
            int countOfMatches = 0;
            int sumOfMatch = 0;
            for (int loopnumber = 1; loopnumber <=1000; loopnumber++){
                if ((loopnumber %3 ==0) && (loopnumber % 5== 0)){
                    countOfMatches ++;
                    sumOfMatch +=loopnumber;
                    System.out.println("Found a match = "+loopnumber);
                }
                if (countOfMatches == 5 ){
                    break;
                }
            }
            System.out.println("sum =" + sumOfMatch);
        }

        // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
        // then press Enter. You can now see whitespace characters in your code.
        public static class Main {
            public static void main(String[] args) {
                // Press Alt+Enter with your caret at the highlighted text to see how
                // IntelliJ IDEA suggests fixing it.
                System.out.printf("Hello and welcome!");

                // Press Shift+F10 or click the green arrow button in the gutter to run the code.
                for (int i = 1; i <= 5; i++) {

                    // Press Shift+F9 to start debugging your code. We have set one breakpoint
                    // for you, but you can always add more by pressing Ctrl+F8.
                    System.out.println("i = " + i);
                }
            }
        }
    }
}
