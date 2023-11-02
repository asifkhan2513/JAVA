abstract class Marks{
    abstract void getMark();
}
class StudentA extends Marks{
   int m=90;
   int n=89;
   int o=88;
    @Override
    void getMark() {
        // int n;
        // int m;
        // int o;
       System.out.println((m+n+o)/3);
    }
}
class StudentB extends Marks{
    int a=86;
    int b=86;
    int c=84;
    int d=85;

    @Override
  
    void getMark()
    {
        System.out.println((a+b+c+d)/4);
    }
}

 class abstractstudent {
    public static void main(String[] args) {
        StudentA a = new StudentA();
        a.getMark();
        StudentB b = new StudentB();
        b.getMark();    
        
    }
}
