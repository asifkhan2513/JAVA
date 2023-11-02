public class Employee {
    String name;
    int emp_id;
    Employee(String name, int emp_id) {
        this.name = name;
        this.emp_id = emp_id;
    }
    public static void main(String[] args) {
        Employee s = new Employee("Asif", 101);
        Employee s1 = new Employee("mukesh", 102);
        System.out.println(" Employee 1 : " + s.name + " " + s.emp_id);
        System.out.println(" Employee 2 : " + s1.name + " " + s1.emp_id);
    }
}
