package exercicios.lista_de_exercicios_09_polimorfismo.questao_02.classes;

public class CheckingAccount extends Account {
    public CheckingAccount(int accountNumber, String customerCPF, double balance, String bank) {
        super(accountNumber, customerCPF, 0.30, balance, bank);
    }

    @Override
    public void withdraw(double value) {
        double withdrawalFee = 0.30;
        double totalValue = value + withdrawalFee;
        if (totalValue <= balance) {
            balance -= totalValue;
            System.out.println("Saque de $" + value + " (incluindo taxa de $0.30) realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }
}


