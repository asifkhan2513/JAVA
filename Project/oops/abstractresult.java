abstract class m {
    m() {
        System.out.println("this is constructor");
    }

    abstract void a_method();

    void b_method() {
        System.out.println("this is non abstract method");
    }
}

class Bi extends m {

    public void a_method() {
        System.out.println("this is normal method");
    }
}

class abstractresult {
    public static void main(String[] args) {
        Bi n = new Bi();
        n.a_method();
        n.b_method();

    }
}
