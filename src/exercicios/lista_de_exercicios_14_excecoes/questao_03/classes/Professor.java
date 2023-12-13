package exercicios.lista_de_exercicios_14_excecoes.questao_03.classes;

public class Professor extends Pessoa {
  private double salario;

  public Professor(String nome, String cpf, String dataNascimento, double salario) {
    super(nome, cpf, dataNascimento);
    this.salario = salario;
  }

  public double getSalario() {
    return salario;
  }

  @Override
  public String toString() {
    return super.toString() + "\nSalário: " + salario;
  }
}