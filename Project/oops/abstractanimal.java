abstract class Animal {
    abstract void sound();
}
class cat extends Animal {
    void sound() {
        System.out.println(" cats mews");
    }
}
class Dogs extends Animal {
    void sound() {
        System.out.println(" Dogs barking");
    }
}
class abstractanimal{
    public static void main(String[] args) {
        cat c = new cat();
        c.sound();
        Dogs d = new Dogs();
        d.sound();
    }
}
