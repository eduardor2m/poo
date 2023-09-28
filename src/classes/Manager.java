package classes;

public class Manager extends Funcionary {
  private String departament;

  public Manager(String name, String CPF, String birthdate, String departament) {
    super(name, CPF, birthdate);
    this.departament = departament;
  }

  public String getDepartament() {
    return this.departament;
  }

  public void setSalary(double salary) {
    double salaryT = super.getSalary() + 1500;
    super.setSalary(salaryT);
  }

  public void setDepartament(String departament) {
    this.departament = departament;
  }
}