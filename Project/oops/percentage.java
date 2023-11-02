class Number {
    double physics, chemistry, math, eng, hindi;

    Number(double p, double c, double m, double e, double h) {
        physics = p;
        chemistry = c;
        math = m;
        eng = e;
        hindi = h;
    }

    double Add() {
        return (physics + chemistry + math + eng + hindi);
    }
}

class Avag extends Number {
    // double avarage;
    double per ;
    Avag(double p, double c, double m, double e, double h) 
    {
        super(p, c, m, e, h);
    }
   {
   
    super(p, c, m, e, h);
    // average = a;
    // double = per;
   }
   void percentag(){
    per= (physics+chemistry+math+eng+hindi)/5;
   }

}

class percentage {
    public static void main(String[] args) {
        percentage p = new percentage();
        // p.Add(90,95,89,78);
        p.percentage(98,95,84,85,94);
    }
}
