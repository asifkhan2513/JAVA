public class backinmain {
    public static void main(String[] args) {
        System.out.println(" i am main");
        italy();
        System.out.println("finally i am back in main class");

    }
    static void italy(){
        System.out.println(" i am italy");
        brazil();

    }
    static void brazil(){
        System.out.println(" i am brazil");
        argentina();

    }
    static void argentina(){
        System.out.println(" i am argentina");
    }
}
