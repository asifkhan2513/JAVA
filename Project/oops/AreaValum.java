class Shape{
    double length,width;
    double Area(double l , double w){
        length = l;
        width = w;
        return (l*w);      
    }

}
class Rectangle extends Shape{
    double height,vol;
    void Valume (double l, double w, double h){
        length =l;
        width = w;
        height = h;
        vol =length*width*height;
        System.out.println("the valume is = "+vol);
    }
}

class AreaValum {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("the area  is = "+r.Area(5,9));
        r.Valume(5.5, 6.5, 9.35);
    }
}
