import java.util.Random;
import java.util.Scanner;

class Bank{
    public String nameOfDepositor;
    public int accNumber;
    public String accType;
    public double balanceAmount;
     
    public void assignValues(String nameOfDepositor, String accType, double balanceAmount){
        this.nameOfDepositor = nameOfDepositor;
        this.accNumber = accNumber;
        this.accType=accType;
        this.balanceAmount= balanceAmount;
        Random random = new Random();
        this.accNumber=random.nextInt(100000000);
        System.out.println("your account number is "+accNumber);


    }
    public void depositAmount(double amount){
        if(accNumber==0){
            System.out.println("!you don't have bank account to deposite");
            
        }
        else{
            balanceAmount+=amount;
            System.out.println(" Deposited successful");
        }

    }
    public void withdrawAmount(double amount){
        if(accNumber==0){
            System.out.println(" you dont have account to widthdraw");
        }
        else if(balanceAmount>amount){
            balanceAmount-=amount;
        System.out.println(" withdrawal successful");
        }
        else{
            System.out.println("! Insufficient balance");
        }
    }
    public void displayDetails(){
        if (accNumber==0) {
            System.out.println("!You don't have bank account\nNote:please assign values to create an account");
        }
        else
        {
            System.out.println("Name of the Depositor: "+nameOfDepositor);
            System.out.println("Balance amount in the account: "+balanceAmount);
        }

    }
    public void getInput(){
        System.out.println("------How maay i help you-------");
        System.out.println(" 1 Press For Open Account");
        System.out.println(" 2 Press For Deposite Amount ");
        System.out.println(" 3 Press For Withdrawal Amount");
        System.out.println(" 4 Press for Account Details");
        System.out.println(" 5 Press For Exit");
        System.out.println(" Please choose any digit");

    }

} 
  
 
 class Main1 {
    public static void main(String[] args) {
       System.out.println(":::::::::::WELCOME TO THE ASIF BANK:::::::::::"); 
       Bank newAcc= new Bank();
       Scanner sc = new Scanner(System.in);
       boolean process = true;
       int continueState=0;
       while( continueState==0){

       }
    }    
}
