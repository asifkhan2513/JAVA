interface area{
    final static float pi=3.14f;
    public float compute(float x,float y);
}
class Rectangle implements area{
    public  double compute(double d , double e)
    {
        return d*e;
    }
    
   
    class circle implements area{
        public float compute (float d , float e){
        return  (pi*d*d);
        }
    }


    @Override
    public float compute(float x, float y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compute'");
    }
}


class implimentationinterface {
    public static void main(String[] args) {
        Rectangle b = new Rectangle();
        circle c = new circle();
        System.out.println(" the   area of rectangle = "+b.compute(5.5, 6.5));
        System.out.println(" the area of circle is = "+c.compute(3.0,0));
    }
}
