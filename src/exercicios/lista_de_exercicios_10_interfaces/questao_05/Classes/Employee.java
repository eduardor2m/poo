package exercicios.lista_de_exercicios_10_interfaces.questao_05.Classes;

public class Employee extends Person {
  private double salary;

  public Employee(String name, String cpf, String birthDate, double salary) {
    super(name, cpf, birthDate);
    this.salary = salary;
  }

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
  
}
