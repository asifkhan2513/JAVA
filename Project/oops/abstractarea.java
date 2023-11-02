abstract class shape{

    public abstract void rectanglearea(double l, double w);
    public abstract void squarearea(double side);
    public abstract void circlearea(double radious);

}
class area{
    void rectanglearea(double l ,double w){
        System.out.println("rectangle of area = "+l*w);
    }
    void squarearea(double side){
        System.out.println("area of square = "+(side*side));
    }
    void circlearea(double radious){
        System.out.println(" area of circle = "+(3.14*radious*radious));
    }
}

class abstractarea {
    public static void main(String[] args) {
        area a = new area();
        a.rectanglearea(5.4, 3.4);
        a.squarearea(6.0);
        a.circlearea(7);
    }
}
