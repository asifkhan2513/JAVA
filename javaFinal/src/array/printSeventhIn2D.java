package array;
public class printSeventhIn2D {
    public  static  int  PrintSeven(int [][]arr , int n){
    int count = 0;
        for (int[] row : arr) {
            for (int num : row) {
                if (num == n){
                    count++;
                }
            }
        }
        return count;
       
    }
    public static void main(String[] args) {
        int[][] arr = {
                           {4,7,8},{8,8,7}
                };
      int n = 8;
       int ans  =  PrintSeven(arr , n);
        System.out.println(ans);

    }
}
