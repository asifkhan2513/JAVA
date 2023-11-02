class A {
    public void display() {
        System.out.println(" i am from method from class a");
    }
}
class B extends A {
    public void print() {
        System.out.println(" i am method from class b");
    }
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.print();
    }
}
