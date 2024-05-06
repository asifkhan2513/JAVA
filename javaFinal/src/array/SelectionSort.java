package array;

public class SelectionSort {
    public  static  void  selection (int [] arr){
        int n  = arr.length;
        for (int i = 0; i <n -1; i++) {
                int maxPos = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[maxPos] < arr[j]) {
                    maxPos = j;
                }
            }
            // Swap arr[i] and arr[maxPos]
            int temp = arr[i];
            arr[i] = arr[maxPos];
            arr[maxPos] = temp;
        }
    }
    public  static  void  printArray(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]  = {9 , 3, 3,2,4,6};
        selection(arr);
        printArray(arr);
    }
}
