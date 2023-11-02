// mean of a number and standard deviation


public class Mean_Stdev {
    public static void main(String[] args) {
       int n[] = {2,3,4,5};
       int sum =0,sumsq=0;
       double mean,stdev;

       for(int i=0;i<n.length;i++){
        sum +=n[i];
        sumsq += n[i] * n[i];

        
       }  
       mean = (double)sum /n.length;
       stdev= Math.sqrt((double)sumsq / n.length-mean*mean);

    //    System.out.println("mean = %f");  
    System.out.println( mean);
    System.out.println(stdev);
    }
}   
