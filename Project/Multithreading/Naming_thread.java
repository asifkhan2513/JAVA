import  java.lang.*;
class Naming_thread extends Thread {
   public void run(){
    System.out.println("Running....");
   }
   public static void main(String[] args) {
    Naming_thread t1 = new Naming_thread();
    Naming_thread t2 = new Naming_thread();
    System.out.println("Name of t1 is : "+t1.getName());
    System.out.println("Name of t2 is : "+t2.getName());
    t1.setName("Asif");
    System.out.println("After set the t1  name is : "+t1.getName());
    t1.start();
    t2.start();

   }
}
