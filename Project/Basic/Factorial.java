import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Any Number");
    int fact = 1, n;
    n = sc.nextInt();
    for (int i = 1; i < n + 1; i++) {
      fact = fact * i;
      System.out.println("---------");
      System.out.println("Here is value is = :" + fact);
    }
    System.out.println("Final factirial ==>" + fact);
  }
}
