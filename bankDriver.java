public class bankDriver {
    public static void main(String[] args) {
        bankAccount myBank = new bankAccount();
        myBank.setBalance(500000);
        System.out.println(myBank.getBalance());
    }
}
