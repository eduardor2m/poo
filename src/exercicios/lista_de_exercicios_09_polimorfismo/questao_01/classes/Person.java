package exercicios.lista_de_exercicios_09_polimorfismo.questao_01.classes;

public class Person {
  private String name;
  private String CPF;
  private String birthdate;

  public Person(String name, String CPF, String birthdate) {
    this.name = name;
    this.CPF = CPF;
    this.birthdate = birthdate;
  }

  public String getName() {
    return this.name;
  }

  public String getCPF() {
    return this.CPF;
  }

  public String getBirthdate() {
    return this.birthdate;
  }
}