interface area {
    final static float pi = 3.14f;

    float compute(double d, double e);

}

class rectangle implements area {
    public float compute(double x, double y) {
        return (float) (x * y);
    }

}

class circle implements area {
    public float compute(float x,float y) {
        return (pi * x * x);
    }

    @Override
    public float compute(double d, double e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compute'");
    }

}

    // @Override
    // public float compute(float x, float y) {
    //   return(pi*x*x); 
    // }


class InterfaceTest {

    public static void main(String[] args) {
        rectangle r = new rectangle();

        circle c = new circle();

        // area Area;
        // Area = r;
        // Area = c;
        System.out.println("The rectangle area is = " + r.compute(6.5, 5.6));
        System.out.println("The area of circle is = "+ c.compute(10, 0));

    }
}
