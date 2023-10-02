package exercicios.lista_de_exercicios_09_polimorfismo.questao_02.classes;

public class CurrentAccount extends Account {
  public CurrentAccount(String accountNumber, String CPF, double tax, String bank) {
    super(accountNumber, CPF, tax, bank);
  }

  @Override
  public void update() {
    super.setSaldo( super.getSaldo() - super.getTax() );
  }
}
