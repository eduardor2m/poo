package recursos.teste01.classes;

public class Aluno extends Pessoa {
  private double[] notas;
  private String classe;

  public Aluno(String name, String dataDeNascimento, String CPF, double[] notas, String classe) {
    super(name, dataDeNascimento, CPF);
    this.notas = notas;
    this.classe = classe;
  }

  @Override
  public String toString() {
    return classe;
  }

  public double getMedia() {
    return notas[0];
  }
}
