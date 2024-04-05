package entities;

public class BankAccount {
    private String holder;
    private final int account; // final para não mudar o número da conta
    private double balance;
    protected final double TAX = 5.00; // variável que prevê mudança de taxa diretamente por aqui

    // construtor para quando houver depósito inicial
    public BankAccount(int account, String holder, double initialDeposit) {
        this.holder = holder;
        this.account = account;
        newDeposit(initialDeposit); // método para garantir que o depósito seja feito da forma necessária
    }

    // construtor para quando não houver depósito inicial
    public BankAccount(int account, String holder) {
        this.holder = holder;
        this.account = account;
    }

    //getters e set por formalidade, mas sem uso nesse contexto
    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public void newDeposit(double deposit) {
        this.balance += deposit;
    }

    public void newWithdraw(double withdraw) {
        this.balance -= withdraw + TAX;
    }

    public String toString() {
        return "Account: "
                + account
                + ", Holder: "
                + holder
                + ", Balance: $"
                + String.format("%.2f", balance);
    }
}