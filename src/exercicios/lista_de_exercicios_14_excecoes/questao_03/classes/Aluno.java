package exercicios.lista_de_exercicios_14_excecoes.questao_03.classes;

public class Aluno extends Pessoa {
  private double[] notas;

  public Aluno(String nome, String cpf, String dataNascimento) {
    super(nome, cpf, dataNascimento);
    this.notas = new double[4];
  }

  public double[] getNotas() {
    return notas;
  }

  public void setNota(int index, double nota) {
    if (index >= 0 && index < 4) {
      notas[index] = nota;
    } else {
      throw new IllegalArgumentException("Índice de nota inválido.");
    }
  }

  public double calcularMedia() {
    double soma = 0;
    for (double nota : notas) {
      soma += nota;
    }
    return soma / notas.length;
  }

  @Override
  public String toString() {
    return super.toString() + "\nNotas: " + java.util.Arrays.toString(notas);
  }
}