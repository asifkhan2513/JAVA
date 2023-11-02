class Rectangle{
    double length,width;
    void getdata(double length,double width){
        this.length=length;
        this.width= width;
    }
   double  area(){
        return (length*width);
    }
}
class Rectarea {
    public static void main(String[] args) {
       // Rectarea s = new Rectarea();
       Rectangle s = new Rectangle();
       s.getdata(3, 2);
       double a= s.area();
       System.out.println(a);
       Rectangle b = new Rectangle();
       b.getdata(4.5f, 5.4f);
       double m=   b.area();
       System.out.println(m);

    }
}
