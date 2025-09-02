class BankAcc{
  public static void main (String[] args){
    Bank b = new Bank();
    System.out.println("intital balance "+b.getBalance());
    b.deposit(100);
    System.out.println("after deposit "+ b.getBalance());
    b.withdraw(200);
    System.out.println("after withdraw "+ b.getBalance());
  }
}
class Bank{
  private  int accountNumber = 1234567890;
  private  int balance=1000;
  
  public int getBalance(){
    return balance;
  }
  public void deposit(int amount){
    balance = balance+amount;
  }
  public void withdraw(int amount){
    balance =  balance - amount;
  }

}
