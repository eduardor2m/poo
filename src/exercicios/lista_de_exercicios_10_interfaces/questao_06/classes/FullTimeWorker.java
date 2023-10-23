package exercicios.lista_de_exercicios_10_interfaces.questao_06.classes;

public class FullTimeWorker extends Worker {

  public FullTimeWorker(String name, String registration, double salary, int age, String adress) {
    super(name, registration, salary, age, adress);
  }

  @Override
  public double getSalary() {
    if (this.getAge() <= 30) {
      return super.getSalary() * 1.16;
    } else {
      return super.getSalary() * 1.25;
    }
  }
  
}
