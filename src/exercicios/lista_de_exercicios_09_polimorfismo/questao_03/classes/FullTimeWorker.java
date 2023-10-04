package exercicios.lista_de_exercicios_09_polimorfismo.questao_03.classes;

public class FullTimeWorker extends Worker {
  public FullTimeWorker(String name, String register, double salary, int age, String adress) {
    super(name, register, salary, age, adress);
  }

  @Override
  public double getSalary() {
    if (super.getAge() <= 30) {
      return super.getSalary() + (super.getSalary() * 0.16);
    } else {
      return super.getSalary() + (super.getSalary() * 0.25);
    }
  }
}
