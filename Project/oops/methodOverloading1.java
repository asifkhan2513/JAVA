class Shape{
    double length,width,area;
    void area(){
        length=5;
        width=6;
        area=(length*width); 
        System.out.println(area);    
    }
    void area(double l , double w){
        length = l;
        width= w;
        area=(length*width);
        System.out.println(area);
    }
  
}
class methodOverloading1 {
    public static void main(String[] args) {
Shape s = new Shape();
    s.area();
    s.area(2.2f,25.1f);


    }
}
