public class BinarySearch {
    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 5, 7, 8, 9, 14, 16, 19, 24 };
        int srch = 16;
        int hi=a.length-1;
        int li = 0;
        int mid=(li+hi)/2;
        while (li <= hi) {
            if (a[mid] == srch) {
                System.out.println(" the element 16 is " + mid + " at position");
                break;

            } else if (a[mid] < srch) {
                li = mid + 1;
            } else if (a[mid] > srch) {
                hi = mid - 1;

            }
            mid = (hi + li) / 2;
        }
        if(li>hi){
            System.out.println(" the element not found");
        }

    }
}
