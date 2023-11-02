class Student {
    int rollNumber;

    void getnumber(int n) {
        rollNumber = n;
    }

    void putnumber() {
        System.out.println("Roll number = " + rollNumber);
    }
}

class Test extends Student {
    float part1, part2;

    void getMarks(float m1,float m2){
        part1 = m1;
        part2= m2;
        
    }
    void putMarks() {
        System.out.println(" marks obtain ");
        System.out.println(" part1 = " + part1);
        System.out.println(" part2 = " + part2);
    }
}
interface Sports {
    float Sportwt = 6.0f;

    void putwt();

}

class Result extends Test implements Sports {
    float total;

    public void putwt() {
        System.out.println(" sport wt = " + Sportwt);
    }

    void display() {
        total = part1 + part2 + Sportwt;
        putnumber();
        putMarks();
        putwt();
        System.out.println(" the total value is = "+ total);
    }
 
}

class interfacehybrid {
    public static void main                                                                                                                                                                            
    (String[] args) {
         Result s = new Result();
         s.getnumber(101);
        s.getMarks(56.0f, 33.2f);
         s.display();
    }
}
