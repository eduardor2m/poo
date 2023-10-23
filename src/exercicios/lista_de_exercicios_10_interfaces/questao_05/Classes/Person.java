package exercicios.lista_de_exercicios_10_interfaces.questao_05.Classes;

public abstract class Person {
  private String name;
  private String cpf;
  private String birthDate;

  public Person(String name, String cpf, String birthDate) {
    this.name = name;
    this.cpf = cpf;
    this.birthDate = birthDate;
  }

  public String getName() {
    return this.name;
  }

  public String getCpf() {
    return this.cpf;
  }

  public String getBirthDate() {
    return this.birthDate;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

}
