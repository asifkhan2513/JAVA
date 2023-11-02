abstract class vehicle {
    abstract void start();
}

class car extends vehicle {
    void start() {
        System.out.println(" car will strat with key");
    }
}

class scooter extends vehicle {
    void start() {
        System.out.println(" scooter start with kick");
    }
}

class abstractclass {
    public static void main(String[] args) {
        car n = new car();
        n.start();
        scooter s = new scooter();
        s.start();
    }
}
