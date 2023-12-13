package exercicios.lista_de_exercicios_14_excecoes.questao_03.classes;

public abstract class Pessoa {
  protected String nome;
  protected String cpf;
  protected String dataNascimento;

  public Pessoa(String nome, String cpf, String dataNascimento) {
    this.nome = nome;
    this.cpf = cpf;
    this.dataNascimento = dataNascimento;
  }

  @Override
  public String toString() {
    return "Nome: " + nome + "\nCPF: " + cpf + "\nData de Nascimento: " + dataNascimento;
  }

  public String getCPF() {
    return cpf;
  }
}