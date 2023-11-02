class rectangle{
    /**
     *
     */
    int length , width;
    void Rectangle (int i, int j){
        length = i;
        width = j;
    }
    int rectArea(){
        
        return (length*width);

    }
}
public class Hectares {
    /**
     * @param args
     */
    public static void main(String[ ] args) {
        Rectangle rect1 = new Rectangle(15,10);
        int area1 = rect1.rectArea();
        System.out.println(" the area  is  = "+area1);

    }    
}
