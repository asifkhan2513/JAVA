public class findIndex {
    public  static  int[]  find(int arr[], int n , int key){
    int b []= {-1,-1};
    for(int i = 0 ;i<n;i++){
        if (arr[i]==key){
            b[0]=i;
        }
        break;
    }
        for(int i = n-1;i>=0;i--){
        if (arr[i]==key){
            b[1]=i;
        }
        break;
        }
     return b;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,5};
        int n = arr.length;
        int key = 5;
      find(arr,n,key);
    }
}
