import java.util.ArrayList;

public class Generics_cwh {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(678);
        arrayList.add(78);
        arrayList.add(900);
        int  a = (int) arrayList.get(2);
        System.out.println(a);

    }
}
