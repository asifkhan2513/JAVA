public class LargestNum {
    public static void main(String[] args) {
        int  []arr = {1,5,6,4,8,6,10};
        int x=0;
        for(int i = 0;i<arr.length;i++){
            if(x<=arr[i]){
                x = arr[i];
            }
        }
        System.out.println(x);
    }
}
