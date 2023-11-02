public class reverseArray {
    public static  void reverse(int []arr){
        int i =0 , j= arr.length-1,t;
        while (i<j){
            t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }


    }
    public static void print(int []arr){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};
        System.out.println("before reverse array is ");

         print(arr);
        System.out.println("\n After reverse the array is \n");
        reverse(arr);
       print(arr);
    }
}

