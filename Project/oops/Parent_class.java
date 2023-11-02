class A{
    void pcclas(){
        System.out.println(" i am parent class");
    }
}
class B extends A{
    void cclass(){
        System.out.println(" i am child class");
    }
}
class Parent_class {
    public static void main(String[] args) {
        B d= new B();
        d.pcclas();
        d.cclass();
       // d.cclass();
    }
}
