public class occurence {
    public static int firstOcc(int []arr, int n ,int key){
        int s = 0;
        int e = n-1;
        int mid = s+(e-s)/2;
        int ans =-1;
        while (s<=e){
            if (arr[mid]==key){
                ans = mid;
                e = mid-1;
            }
            else if(arr[mid]<key) {

                s = mid+1;
            }
            else if(arr[mid]>key){
                e= mid-1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }
    public static int lastOcc(int []arr, int n ,int key){
        int s = 0;
        int e = n-1;
        int mid = s+(e-s)/2;
        int ans =-1;
        while (s<=e){
            if (arr[mid]==key){
                ans = mid;
                s = mid+1;
            }
            else if(arr[mid]<key) {

                s = mid+1;
            }
            else if(arr[mid]>key){
                e= mid-1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,3,3,3,3,3,3,4,5};
        int n = arr.length;
        int key = 3;

        System.out.println( firstOcc(arr,n,3));
        System.out.println(lastOcc(arr,n,3));


    }
}
