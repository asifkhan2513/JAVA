package array;

public class TwoDArray {
public  static  void  print2D(int [] [] arr ){

    for (int i = 0; i <arr.length; i++) {
        for (int j = 0; j <arr[i].length; j++) {
            System.out.print(arr[i] [j] + " ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        int  [][] mat = {
                             { 1, 2, 3, 4 },
                             { 5, 6, 7, 8 },
                             { 9, 10, 11, 12 }
                         };
        print2D(mat);
    }
}
