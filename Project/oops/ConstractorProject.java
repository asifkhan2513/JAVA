import java.util.*;
class Number{
    private int i;
    public void setData(int j){
        i=j;
    }
    public void getData(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" enter any integer");
            i=sc.nextInt();
        }
    }
    public Number(){
    }
    public Number (int j){
        i=j;
    }
    public void displayData(){
        System.out.println( " this is the display = "+i);
    }
}
public class ConstractorProject {
    public static void main(String[] args) {
        Number n1,n2,n3;
        n1 = new Number();
        System.out.println("--------------------------");
        n1.displayData();
        n1.setData(100);
        n1.displayData();
        System.out.println("--------------------------");
        n2 = new Number();
        n2.displayData();
        n2.getData();
        n2.displayData();
        System.out.println("--------------------------");
        n3 = new Number();
        n3.displayData();
    }
}
