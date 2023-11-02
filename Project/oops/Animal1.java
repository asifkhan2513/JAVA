 class Animal1{
        void eat(){
            System.out.println("eating");
        }
    }
class Dog extends Animal1{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}
