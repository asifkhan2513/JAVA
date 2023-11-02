class Bike1{
    void run(){
        System.out.println(" i am first method ");
    }
}
class Bike2 extends Bike1{
    void run(int a){
        System.out.println(" i am second");
    }
}
 class MethodOverRiding {
    public static void main(String[] args) {
        Bike2 b= new Bike2();
        b.run(10);
    }
}
