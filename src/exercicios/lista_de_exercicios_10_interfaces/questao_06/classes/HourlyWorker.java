package exercicios.lista_de_exercicios_10_interfaces.questao_06.classes;

public class HourlyWorker extends Worker {
  private int hoursWorked;

  public HourlyWorker(String name, String registration, double salary, int age, String adress, int hoursWorked) {
    super(name, registration, salary, age, adress);
    this.hoursWorked = hoursWorked;
  }

  public int getHoursWorked() {
    return this.hoursWorked;
  }

  public void setHoursWorked(int hoursWorked) {
    this.hoursWorked = hoursWorked;
  }

  @Override
  public double getSalary() {
    return super.getSalary() * this.hoursWorked;
  }
  
}
