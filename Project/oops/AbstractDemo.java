  abstract class AbstractDemo{
     abstract void show();
}
class Car extends AbstractDemo{
  void show(){
    System.out.println(" car will start with key");
  }
  class dfg extends AbstractDemo{
    void show(){
      System.out.println(" bike will start with kick");
    }
  }
  public static void main(String[] args) {
    Car c = new Car();
    c.show();

    // dfg z = new dfg();
    // z.show();

  }
}

// class AbstractDemo {
//     public static void main(String[] args) {        
//     }
// }
