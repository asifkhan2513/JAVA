class Employee {
    private String name;

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
    return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee a = new Employee();
        a.setName (" Asif");
        System.out.println(" the name is" + a.getName());
    }

}
