public class MethodOverLoading {
    
    void show(){
        System.out.println(" i am without parameter");
    }
    void show(int a){
        int s=90;
        int d= 100;
        int m= s+d;
        System.out.println(" i am method 2  and sum of two number is ="+m);
    }
    public static void main(String[] args) {
        MethodOverLoading t = new MethodOverLoading();
        t.show(2);
    }
}
