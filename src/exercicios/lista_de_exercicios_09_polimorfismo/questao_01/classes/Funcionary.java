package exercicios.lista_de_exercicios_09_polimorfismo.questao_01.classes;

public class Funcionary extends Person {
  private double salary;

  public Funcionary(String name, String CPF, String birthdate, double salary) {
    super(name, CPF, birthdate);
    this.salary = salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getSalary() {
    return this.salary;
  }
}