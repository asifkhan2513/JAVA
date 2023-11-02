import java.util.Scanner;
class isPrsent2D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        // find the value
        int x = sc.nextInt();
        int[][] arr = new int [row][col];

        // taking input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                arr[i][j]=sc.nextInt();
        }

        // Printing matrix row and column wise
        System.out.println("\n the matrix is \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        // compare input of given value
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == x) {
                    System.out.print("number found at index " + (i + 1) + " " + (j + 1));
                }
            }
        }
    }
}
