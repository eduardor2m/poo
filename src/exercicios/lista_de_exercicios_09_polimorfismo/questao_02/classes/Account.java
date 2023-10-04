package exercicios.lista_de_exercicios_09_polimorfismo.questao_02.classes;

public class Account {
    protected int accountNumber;
    protected String customerCPF;
    protected double fee;
    protected double balance;
    protected String bank;

    public Account(int accountNumber, String customerCPF, double fee, double balance, String bank) {
        this.accountNumber = accountNumber;
        this.customerCPF = customerCPF;
        this.fee = fee;
        this.balance = balance;
        this.bank = bank;
    }

    public void update() {
        balance -= fee;
    }

    public void withdraw(double value) {
        if (value <= balance) {
            balance -= value;
            System.out.println("Saque de $" + value + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    public void deposit(double value) {
        balance += value;
        System.out.println("Depósito de $" + value + " realizado com sucesso.");
    }
}