package bank;

class Bankaccount {
    private double balance;

    public Bankaccount(double openingbalance)
    {
        balance = openingbalance;
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public void withdraw(double amount)
    {
        balance = balance - amount;
    }

    public void display()
    {
        System.out.println("balance =" + balance);
    }
    
}

class Bankapp
{
    public static void main(String[] args)
    {
        Bankaccount bal1 = new Bankaccount(100.00);

        System.out.println("Before transaction,");
        bal1.display();

        bal1.deposit(74.35);
        bal1.withdraw(20.00);

        System.out.print("After Transaction,");
        bal1.display();
    }
}

