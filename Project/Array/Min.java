public class Min {
    public static void main(String[] args) {
        int[] a = { 4, 3, 5, 2, 8, 1, 6 };
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }

        }
        System.out.println(" min " + min);
    }
}
