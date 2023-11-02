public class linearSearch {
    static  int printArray(int []a,int n,int key){
        for (int i=0;i<n;i++){
            if (a[i]==key){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int []a = {1,5,4,3,9,7};
        int n = a.length;
        int key = 3;

        System.out.println(key +" present at position "+printArray(a,n,key));

    }
}
