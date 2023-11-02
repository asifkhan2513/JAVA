import java.util.Scanner;

public class Minimum_And_Maximum {
    static  int getmin(int arr[], int n){
        int res = arr[0];
        for(int i=0;i<n;i++){
            res = Math.min(res,arr[i]);
//

        }

        return res;
    }
    static  int getmax(int arr[],int n){
        int res= arr[0];
        for(int i=0;i<n;i++){
            res = Math.max(res,arr[i]);
        }
        return res;

    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int arr[]={12,5,6,8,9};
        int  n= arr.length;
        System.out.println("the maximum number is = " +getmax(arr,n));
        System.out.println("minimum number is = "+getmin(arr,n));
    }
}
