abstract class parent{
abstract  void message();
}
class child extends parent{
   void message(){
    System.out.println("ths is first");
   }
}
class child2 extends parent{
    void message(){
        System.out.println("this is second ");
    }
}
class abstractparent{
    public static void main(String[] args) {
       child c1= new child();
       c1.message();
       child2 c2= new child2();
       c2.message(); 
    }
}
