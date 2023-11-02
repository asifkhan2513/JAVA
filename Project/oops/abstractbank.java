abstract class Bank {

    abstract void getbalance();

}

class BankA extends Bank {
    void getbalance() {
        System.out.println(" deposited 100$");
    }
}

class BankB extends Bank {
    void getbalance() {
        System.out.println(" deposited 150$");
    }
}

class BankC extends Bank {
    void getbalance() {
        System.out.println(" deposited 200$ ");
    }
}

class abstractbank {
    public static void main(String[] args) {
        BankA a = new BankA();
        a.getbalance();
        BankB b = new BankB();
        b.getbalance();
        BankC c = new BankC();
        c.getbalance();
    }
}
