class Area {
    double length, width, area;
    Area() {
        length = 5;
        width = 6;
        area = (length * width);
        System.out.println(area);
    }
    Area(double l, double w) {
        length = l;
        width = w;
        area = (length * width);
        System.out.println(area);
    }
    Area(double l) {
        length = l;
        area = (length * length);
        System.out.println(area);
    }
}
class ConstructorOverloading {
    public static void main(String[] args) {
        Area s = new Area();
        Area s1 = new Area(45.5f, 65.5f);
        Area s2 = new Area(45);

    }
}
