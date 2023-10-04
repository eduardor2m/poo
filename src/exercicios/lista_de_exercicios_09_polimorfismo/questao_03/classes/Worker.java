package exercicios.lista_de_exercicios_09_polimorfismo.questao_03.classes;

public class Worker {
  private String name;
  private String register;
  private double salary;
  private int age;
  private String adress;

  public Worker(String name, String register, double salary, int age, String adress) {
    this.name = name;
    this.register = register;
    this.salary = salary;
    this.age = age;
    this.adress = adress;
  }

  public double getSalary() {
    return this.salary;
  }

  public String getName() {
    return name;
  }

  public String getRegister() {
    return register;
  }

  public int getAge() {
    return age;
  }

  public String getAdress() {
    return adress;
  }
}
