public class peak {

    public  static  int mountain (int []a,int n){

        int s =0 ;
        int e  = n-1;
        int mid = s+(e-s)/2;
        while (s<e){
            if(a[mid]<a[mid+1]){
                s= mid +1;
            }
            else{
                e = mid;
            }
            mid = s+(e-s)/2;
        }
        return s;

    }
    public static void main(String[] args) {
        int []a = {0,1,2,3,0}; //answer should be three
        int n = a.length;
        System.out.println( mountain(a,n));




    }
}
