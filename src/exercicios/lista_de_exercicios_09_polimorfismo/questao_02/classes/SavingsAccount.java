package exercicios.lista_de_exercicios_09_polimorfismo.questao_02.classes;

public class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, String customerCPF, double balance, String bank) {
        super(accountNumber, customerCPF, 0.0, balance, bank);
    }

    @Override
    public void update() {
        balance += fee;
    }
}