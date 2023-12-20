package provas.prova_excecoes.classes;

public class TrabalhadorIntegral extends Trabalhador {

  public TrabalhadorIntegral(String name, double salario, int idade) {
    super(name, salario, idade);
  }

  @Override
  public double calcSalario() {
    if (super.getIdade() <= 30) {
      return super.getSalario() * 1.16;
    } else {
      return super.getSalario() * 1.30;
    }
  }
}
