import java.util.Scanner;
class profitloss{
public static void main(String args[]){
double sp,p;
System.out.println(" enter  bought price \n");
Scanner sc = new Scanner(System.in);
p= sc.nextDouble();
System.out.println(" enter the sell price\n");
sp= sc.nextDouble();
if(p<sp)
{
System.out.println("  profit");

}
else
{
System.out.println("loss");

}
}
}
