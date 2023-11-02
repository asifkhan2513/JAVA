import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        System.out.println("Enter the length of the Array");
        int n;
        Scanner sc = new Scanner( System.in);
        n = sc.nextInt();
        int arr[] = new int [10];
        System.out.println("Enter the element one by one ");
        for ( int i = 0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The element are is ");
        for (int  i = 0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
