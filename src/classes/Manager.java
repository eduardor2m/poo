package classes;

public class Manager extends Funcionary {

  public Manager(String name, String CPF, String birthdate, double salary) {
    super(name, CPF, birthdate, salary);
  }

  public double getSalary() {
    return super.getSalary() + 1.500;
  }
}