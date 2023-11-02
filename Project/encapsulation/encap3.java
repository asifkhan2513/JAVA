class Number{
    private String name;
    private int age ;
    private String course;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getCourse(){
        return course;

    }
    public void setCourse(String course)
    { this.course= course;
    }
   
}
public class encap3 {
    public static void main(String[] args) {
        Number a= new Number();
        a.setName("asif");
        a.setAge(22);
        a.setCourse("MCA");
        System.out.println(" name = "+a.getName()+"\n age = "+a.getAge()+" \n course = "+a.getCourse());
    }
}
