class Student{
    private String name;
    private int age;
    private String addr;
    public void setName(String name){
        this.name= name;
    }
    public void setAge(int age){
        this.age= age ;
    }
    public void setAddr(String addr){
        this.addr= addr;
    }
    public String getName(){
        return name ;
    }
    public int getAge(){
        return age ;
    }
    public String getAddr(String addr){
        return addr ;
    }

}
public class Encap2{
    public static void main(String[] args) {
        Student a = new Student();
        a.setName("Asif");
        a.setAge(23);
        a.getAddr("lucknow");
        System.out.println("\n the name is " +a.getName()+ " \n the age is " +a.getAge()+ " \n the address is "+a.getAddr("lucknow"));
    }
}
