class Mamal{

public void display(){
    System.out.println(" i  am mamal");
}
} 
 class MarineMamal extends Mamal{
public void display1(){
    System.out.println(" i am marine mamal");
}

 }
 class Whale extends MarineMamal {
    public void s(){
        System.out.println(" i am both");
    }
   public static void main(String[] args) {
    //MarineMamal c = new MarineMamal();
    Whale c = new Whale();
    c.display();
    c.display1();
    c.s();
   } 
}
