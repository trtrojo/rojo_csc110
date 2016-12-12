public class AccountDemo {
 public static void main(String[] args)
  {
   BankAccount account = new BankAccount();
   //deposit $500
   account.deposit(500.0);
   //Display the balance
   System.out.println("Balance: $" + account.getBalance());
   //Widthdraw $300
   account.withdraw(300.0);
   //display the balance
   System.out.println("Balance: $" + account.getBalance());
  }
}
