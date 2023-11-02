class Box{
    double length,widtgh,hieght;
    void Valume(double l, double w , double h){
        // double length= l;
        // double widtgh = w;
        // double hieght = h;
        double vol= l*h*w;
        System.out.println(" the valume is = "+ vol);

    }  
}
class boxDemo {
    public static void main(String[] args) {
      Box B= new Box();
      Box B1= new Box();
      B.Valume(2,3,4);
      B.Valume(2.5, 3.6, 4.7);
    }
}
