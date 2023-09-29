package exercicios.lista_de_exercicios_09_polimorfismo.questao_01.classes;

public class Manager extends Funcionary {
  private String department;

  public Manager(String name, String CPF, String birthdate, double salary, String department) {
    super(name, CPF, birthdate, salary);
    this.department = department;
    super.setSalary(salary + 1500);
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getDepartment() {
    return this.department;
  }
}