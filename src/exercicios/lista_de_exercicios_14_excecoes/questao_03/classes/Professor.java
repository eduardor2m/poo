package exercicios.lista_de_exercicios_14_excecoes.questao_03.classes;

public class Professor extends Pessoa {
  private double salario;

  public Professor(String name, String CPF, String dataDeNascimento, double salario) {
    super(name, CPF, dataDeNascimento);
    this.salario = salario;
  }

  public double getSalario() {
    return salario;
  }

  public String toString() {
    return "Nome: " + getName() + "\n" +
        "CPF: " + getCPF() + "\n" +
        "Data de nascimento: " + getDataDeNascimento() + "\n" +
        "Salário: " + salario;
  }
}
