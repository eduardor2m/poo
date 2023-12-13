package recursos.teste01.classes;

public class Professor extends Pessoa {
  private double salario;

  public Professor(String name, String dataDeNascimento, String CPF, double salario) {
    super(name, dataDeNascimento, CPF);
    this.salario = salario;
  }

  public String toString() {
    return super.getName();
  }

  public double getSalario() {
    return this.salario;
  }

}
