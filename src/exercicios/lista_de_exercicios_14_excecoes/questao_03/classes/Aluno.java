package exercicios.lista_de_exercicios_14_excecoes.questao_03.classes;

public class Aluno extends Pessoa {
  private String classe;
  private Double notas[];

  public Aluno(String name, String CPF, String dataDeNascimento, String classe, Double notas[]) {
    super(name, CPF, dataDeNascimento);
    this.classe = classe;
    this.notas = notas;
  }

  public Double getMedia() {
    Double soma = 0.0;
    for (Double nota : notas) {
      soma += nota;
    }
    return soma / notas.length;
  }

  public String toString() {
    return "Nome: " + getName() + "\n" +
        "CPF: " + getCPF() + "\n" +
        "Data de nascimento: " + getDataDeNascimento() + "\n" +
        "Classe: " + classe + "\n" +
        "Média: " + getMedia();
  }
}
