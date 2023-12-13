package recursos.teste01.classes;

public abstract class Pessoa {
  private String name;
  private String dataDeNascimento;
  private String CPF;

  public Pessoa(String name, String dataDeNascimento, String CPF) {
    this.name = name;
    this.dataDeNascimento = dataDeNascimento;
    this.CPF = CPF;
  }

  public String getName() {
    return this.name;
  }

  public String getDataDeNascimento() {
    return this.dataDeNascimento;
  }

  public String getCPF() {
    return this.CPF;
  }
}
