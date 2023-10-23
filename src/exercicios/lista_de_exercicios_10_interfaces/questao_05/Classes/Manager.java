package exercicios.lista_de_exercicios_10_interfaces.questao_05.Classes;

public class Manager extends Employee {
  private String department;
  private double bonus;

  public Manager(String name, String cpf, String birthDate, double salary, String department) {
    super(name, cpf, birthDate, salary);
    this.department = department;
    this.bonus = 1.500;
  }

  public String getDepartment() {
    return this.department;
  }

  public double getBonus() {
    return this.bonus;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  @Override
  public double getSalary() {
    return super.getSalary() + this.bonus;
  }
  
}
