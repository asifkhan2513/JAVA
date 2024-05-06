package array;

public class FindKey {
    public static void find (int [][] matrix , int key){
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[row] [col] == key ){
                    System.out.print("key is present");
                    break;
                }
                else{
                    System.out.print("key is not present");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [][] matrix = {
                            { 1,2,3,4 }
                            ,{5,6,7,8}
                            };
        int target = 8;
        find(matrix , target);
    }


}
