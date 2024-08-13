public class bankAccount {
    int accountNumber;
    private double balance;

public void setBalance(double balance){
    this.balance = balance;
}
public double getBalance(){
    System.out.println("Your balance is : ");
    return this.balance;
}
}
