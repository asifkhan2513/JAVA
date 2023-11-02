import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        System.out.println("Enter the value row");
        Scanner sc = new Scanner(System.in);
        int row;
         row  = sc.nextInt();
        System.out.println("Enter the value  of column ");
        int col = sc.nextInt();
        int arr [][] = new int [row] [col];

        //for taking input from user
        System.out.println("Enter the value one  by one");
        for( int i =  0;i <row; i++){
            for ( int j  = 0 ; j <col ; j++){
                arr[row] [col] = sc.nextInt();
            }
        }

        // for printing array
        System.out.println(" The entered  inout from above given array");
        for ( int i =0; i<row;i++){
            for (int j = 0 ; j <= col;j++){
                System.out.println(arr[i] [j]);
            }
        }

    }

}
