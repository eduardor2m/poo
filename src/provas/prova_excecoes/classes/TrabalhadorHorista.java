package provas.prova_excecoes.classes;

public class TrabalhadorHorista extends Trabalhador {
  private int horasTrabalhadas;

  public TrabalhadorHorista(String name, double salario, int idade, int horasTrabalhadas) {
    super(name, salario, idade);
    this.horasTrabalhadas = horasTrabalhadas;
  }

  public double calcSalario() {
    return this.getSalario() * this.horasTrabalhadas;
  }

}
