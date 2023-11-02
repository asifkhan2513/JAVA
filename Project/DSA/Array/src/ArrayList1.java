import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList<>();
        cars.add("volvo");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.get(4));
//        for (int i = 0;i<cars.size();i++){
//            System.out.print(" "+ cars);
//        }
        System.out.print(cars);
        System.out.println("\n-----------------");
        cars.set(0,"BOLERO");
        System.out.println(cars);
        System.out.println("\n-----------------");
        //cars.remove(0);
        System.out.println(cars.remove(0));
        System.out.println("\n-----------------");
        cars.size();
        System.out.println(cars.size());

        System.out.println("\n---------------------\n");
        System.out.println("\nNOW aceesing from loop\n");
        for (int i = 0 ; i<cars.size();i++){
            System.out.println(cars.get(i));
        }
    }
}
