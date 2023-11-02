class Data {
    int a = 10, b = 2;
    void Add() {
        System.out.println("addition = " + (a + b));
    }

    void sub() {
        System.out.println("the sub is = " + (a - b));
    }

    void mul() {
        System.out.println("the mul is  =  " + (a * b));
    }

    void div() {
        System.out.println("the div is = " + (a / b));
    }

    void mod() {
        System.out.println("the modulo is = " + (a % b));
    }
}

class calc3 {
    public static void main(String[] args) {
        Data s = new Data();
        s.Add();
        s.sub();
        s.mul();
        s.div();
        s.mod();
    }

}
