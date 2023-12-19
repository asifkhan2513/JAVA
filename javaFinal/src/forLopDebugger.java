public class forLopDebugger {
    public static void main(String[] args) {
        int countOfMatches = 0;
        int sumOfMatch = 0;
        for (int loopnumber = 1; loopnumber <=1000; loopnumber++){
            if ((loopnumber %3 ==0) && (loopnumber % 5== 0)){
                countOfMatches ++;
                sumOfMatch +=loopnumber;
                System.out.println("Found a match = "+loopnumber);
            }
            if (countOfMatches == 5 ){
                break;
            }
        }
        System.out.println("sum =" + sumOfMatch);
    }
}
