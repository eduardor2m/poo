package exercicios.lista_de_exercicios_09_polimorfismo.questao_02.classes;

public class Account {
  private String accountNumber;
  private String CPF;
  private double tax;
  private double saldo;
  private String bank;
  
  public Account(String accountNumber, String CPF, double tax, String bank) {
    this.accountNumber = accountNumber;
    this.CPF = CPF;
    this.tax = tax;
    this.saldo = 0;
    this.bank = bank;
  }

  public void update() {
    this.saldo -= this.tax;
  }

  public void deposit(double value) {
    this.saldo += value;
  }

  public void withdraw(double value) {
    this.saldo -= value;
  }

  public String getAccountNumber() {
    return this.accountNumber;
  }

  public String getCPF() {
    return this.CPF;
  }

  public double getTax() {
    return this.tax;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public String getBank() {
    return this.bank;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
}
