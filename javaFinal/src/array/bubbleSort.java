package array;
// Bubble sort in reverse order

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        bubbleSortDescending(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If inner loop swapped no two elements, then break
            if (!swapped) {
                break;
            }
        }
    }
}