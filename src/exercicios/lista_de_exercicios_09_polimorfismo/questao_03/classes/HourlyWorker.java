package exercicios.lista_de_exercicios_09_polimorfismo.questao_03.classes;

public class HourlyWorker extends Worker {
  private double hourValue;
  private double workedHours;

  public HourlyWorker(String name, String register, double salary, int age, String adress, double hourValue,
      double workedHours) {
    super(name, register, salary, age, adress);
    this.hourValue = hourValue;
    this.workedHours = workedHours;
  }
  
  @Override
  public double getSalary() {
    return this.hourValue * this.workedHours;
  }

  public double getHourValue() {
    return hourValue;
  }

  public double getWorkedHours() {
    return workedHours;
  }
}
