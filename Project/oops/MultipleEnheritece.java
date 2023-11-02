 class Member {
    String Name;
    int Age;
    int Phone_numnber;
    String Address ;
    int Salary;
    public void printSalary(){
        System.out.println(Salary);
    }
}
class Empl extends Member {
    String Spelization;
}
class Manager extends Empl{
    String Department;
}
class MultipleEnheritece extends Manager {
    public static void main(String[] args) {
        //Empl b= new Empl();
        Manager b = new Manager();
        System.out.println( b.Name="Asif");     
        System.out.println(b.Age=20);
        System.out.println(b.Spelization="computer");
        System.out.println( b.Salary=50000);
        System.out.println(b.Department="Computer Science");
        System.out.println(b.Address="Siddharth_nagar");
        

    }
}
