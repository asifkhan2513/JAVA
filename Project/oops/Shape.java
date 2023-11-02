import java.security.PublicKey;

class Rectangle{
    public static void rec(){
        System.out.println(" this is rectangle");
    }
    int w;
    int l;
    Rectangle(){
    
    }
    // public int SetW(int w){
    // //     this.w=w;

    // }
public void  SetRec(int y){
    this.w=y;

    }

}
class Circle{
    public static void cir(){
        System.out.println(" this is rectangle");
    }
}
class Shape {
    public static void main(String[] args) {
        Shape s =new Shape();
        s.printshow();
    }
    static void printshow(){
        System.out.println( "This is method");
    }
   
}
