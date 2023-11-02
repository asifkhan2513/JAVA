class Number {
    double physics, chemistry, math, english, hindi;
    double sub(double p, double c, double m, double e, double h) {
        physics = p;
        chemistry = c;
        math = m;
        english = e;
        hindi = h;
        return (physics + chemistry + math + english + hindi);
    }
}

class Percentage extends Number {
    double per;

    void perc(double p, double c, double m, double e, double h) {
        physics = p;
        chemistry = c;
        math = m;
        english = e;
        hindi = h;
        per = (physics + chemistry + math + english + hindi) / 5;
        System.out.println("The total percentage = " + per);
    }
}

class Ar {
    public static void main(String[] args) {
        Percentage p = new Percentage();
        System.out.println("the total number is = " + p.sub(90, 98, 94, 78, 85));
        p.perc(90, 98, 94, 78, 85);
    }
}

