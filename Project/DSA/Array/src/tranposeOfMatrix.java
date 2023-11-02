import java.util.Scanner;

public class tranposeOfMatrix {
    public static void main(String[] args) {
        int arr[][] = new int[3][2] ;
        int i , j ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the all 6 element ");// becoouse the matrix is    MxN
        for ( i = 0; i < arr.length; i++)
            for ( j = 0; j < arr[j].length; j++)
                arr[i][j]=sc.nextInt();


        System.out.println("\n The matrix is \n");
        for ( i = 0; i <arr.length ; i++) {
            for ( j = 0; j <arr[j].length ; j++)
                System.out.print(" " + arr[i][j]);
                System.out.println();
        }
        System.out.println("TRANSEPOSE IS");
        for ( i = 0; i <arr.length ; i++) {
            for ( j = 0; j <arr.length ; j++)
                System.out.print(" "+ arr[j][i]);
                System.out.println();
        }
    }
}
