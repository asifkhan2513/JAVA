import java.util.*;
class simple{
public static void main(String args[]){
double  si,p,r,t;
System.out.println(" enter the  value of p \n");
Scanner sc = new Scanner(System.in);
p=sc.nextDouble();
System.out.println(" enter the value  of r \n");
r= sc.nextDouble();
System.out.println(" enter the value of t \n");
t= sc.nextDouble();
si=(p*r*t)/100;
System.out.println("the value of simple interest is = "+si);

}
}
