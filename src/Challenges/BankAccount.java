package Challenges;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private int balance = 0;

    public int deposit(int amt) {
        return this.balance = balance + amt;
    }

    public void withdraw(int amt) {
        if (this.balance < amt) {
            System.out.println("Insufficent fund ");
        } else {
            this.balance = balance - amt;
        }
    }

    public int show() {
        return balance;
    }


    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        System.out.println(b.deposit(50));
        b.withdraw(60);
        System.out.println(b.show());
    }

}
