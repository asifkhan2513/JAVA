public class LinearSearchStr {
    public static void main(String[] args) {
        String[] a= {"deepak","amit","rahul","deepesh","rohit"};
        String item="amit";
        int temp=0;
        for(int i=0;i<a.length;i++){
            if(a[i].equals(item)){
                System.out.println(" The Number is present "+
                i+" position ");
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println(" number is not found");
        }
    }
}
