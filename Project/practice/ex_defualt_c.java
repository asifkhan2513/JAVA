class perimeter{
    int length ;
    int width;

    //default cons
    Df (){
        length =0;
        width =0;

    }
    
    // parameterized cons
    Df(int x,int y)
    {
    length=x;
    width = y;

    }
    void call(){
        int peri;
        peri= 2*(length + width);
        System.out.println(" the value is ="+peri);
    }
}


public class ex_defualt_c {
    public static void main(String[] args) {
     Df p1= new Df();
     Df p2= new Df(10,15);
        p1.call();
        p2.call();

    }
}
