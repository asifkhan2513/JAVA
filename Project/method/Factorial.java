class Factorial {
    public static void main(String[] args) {
     //ans();
     System.out.println(" the ans is "+ans()); 
    }
    public static int  ans(){
        int n=5;
        int fact=1;
        for(int i=1;i<=5;i++){
            fact= fact*i;           
     }
        return fact;
    }
}