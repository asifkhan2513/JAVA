public class twodir {
    public static void main(String[] args) {
        
       // int[][] a = new int [2][2];
       
       int [][] a = {{1,2,4,},{4,5,6}};
      for(int i=0;i<=a.length;i++){
        for(int j=0;j<=a.length;j++){
            System.out.println(a[i][j]+"\t");
        }
        System.out.println("");
      }

    }
}
