public class uniqueElement {
    static int umique (int []a, int n)
    {
        int ans =0;
        for (int i=0;i<n;i++){
            ans = ans ^ a[i];

        }
        return ans;
    }



    // finding uniques number  in odd array like 10,7,6,3,1 these number are coming 2  time and only 19 is coming one time
    public static void main(String[] args) {
        int []arr = {1,3,1,3,6,6,7,10,7,10,19};// it will be return

        int n = arr.length;

        int  answer =  umique(arr,n);

        System.out.println("the final answer is = " +answer);
    }
}
