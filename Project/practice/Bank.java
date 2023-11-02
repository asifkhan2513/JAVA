import java.util.Scanner;

class bank_account {
    String name;
    long account_number;
    double balance_amount;

    bank_account(String n, long a, double b) {
        name = n;
        account_number = a;
        balance_amount = b;     
    }

    void deposit(double f) {
        if (f > 0) {
            balance_amount = balance_amount + f;
        } else {
            System.out.println(" invalid amount");
        }
    }

    void withdraw(double w) {
        if (w > 0 && w < balance_amount) {
            balance_amount = balance_amount - w;
        } else {
            System.out.println(" invalid amount");
        }
    }

    void display() {
        System.out.println("\nName: " + name);

        System.out.println("balance: " + balance_amount);
    }
}

class Bank {
    private static double f;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            String n;
            long a;
            double b;
            System.out.println(" Enter the Name: ");
            n = sc.next();
            System.out.println(" Enter the account number: ");
            a = sc.nextLong();
            System.out.println(" Enter Balance: ");
            b = sc.nextLong();
            bank_account ban = new bank_account(n, a, b);
          //  ban.display();
            System.out.println(" Enter the amount to be deposited: ");
            f = sc.nextDouble();
           
            ban.deposit(f);
           // ban.display();
            System.out.println(" Enter the withdrawal amount: ");
            double w = sc.nextDouble();
            ban.withdraw(w);
            ban.display();
        }

    }
}
