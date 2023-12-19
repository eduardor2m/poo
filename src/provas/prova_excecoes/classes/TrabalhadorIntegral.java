package provas.prova_excecoes.classes;

public class TrabalhadorIntegral extends Trabalhador {

  public TrabalhadorIntegral(String name, double salario, int idade, double bonus) {
    super(name, salario, idade);
  }

  public double calcSalario() {
    if (this.getIdade() <= 30) {
      return this.getSalario() * 1.16;
    } else {
      return this.getSalario() * 1.30;
    }
  }
}
