public class linearSearch1 {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int key = 5;
        // linearSearch(arr, key);
        System.out.println(key + " system at found at " + linearSearch(arr, key));
    }
}
