package provas.prova_excecoes.classes;

public abstract class Trabalhador {
  private String name;
  private double salario;
  private int idade;

  public Trabalhador(String name, double salario, int idade) {
    this.name = name;
    this.salario = salario;
    this.idade = idade;
  }

  public String getName() {
    return this.name;
  }

  public abstract double calcSalario();

  public int getIdade() {
    return this.idade;
  }

  public double getSalario() {
    return this.salario;
  }

}
