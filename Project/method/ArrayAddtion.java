public class ArrayAddtion {


      public static void Array(int arr[]){
        int sum =0;
        for(int i =0 ;i<arr.length;i++){
            sum = sum+arr[i];
            
        }
        System.out.println(" the sum is = "+sum);
    }
    public static void main(String[] args) {
        ArrayAddtion a = new ArrayAddtion();
        int b []={1,2,3,4,5,6,7,8,9,10};
        a.Array(b);
    }
  
}
