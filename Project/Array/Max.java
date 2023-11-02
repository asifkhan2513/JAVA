public class Max {
    public static void main(String[] args) {
        int[] a = { 4, 3, 5, 2, 8, 1, 6 };
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(" the max is "+max);

    }
}
