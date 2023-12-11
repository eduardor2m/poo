package exercicios.lista_de_exercicios_14_excecoes.questao_03.classes;

public abstract class Pessoa {
  private String name;
  private String CPF;
  private String dataDeNascimento;

  public Pessoa(String name, String CPF, String dataDeNascimento) {
    this.name = name;
    this.CPF = CPF;
    this.dataDeNascimento = dataDeNascimento;
  }

  public String getName() {
    return name;
  }

  public String getCPF() {
    return CPF;
  }

  public String getDataDeNascimento() {
    return dataDeNascimento;
  }
}
