package exercicios.lista_de_exercicios_10_interfaces.questao_06.classes;

public abstract class Worker {
  private String name;
  private String registration;
  private double salary;
  private int age;
  private String adress;

  public Worker(String name, String registration, double salary, int age, String adress) {
    this.name = name;
    this.registration = registration;
    this.salary = salary;
    this.age = age;
    this.adress = adress;
  }

  public String getName() {
    return this.name;
  }

  public String getRegistration() {
    return this.registration;
  }

  public double getSalary() {
    return this.salary;
  }

  public int getAge() {
    return this.age;
  }

  public String getAdress() {
    return this.adress;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }
  
}
