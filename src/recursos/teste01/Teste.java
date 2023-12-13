package recursos.teste01;

import java.util.Scanner;

import recursos.teste01.classes.Aluno;

public class Teste {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double[] notas = new double[1];
    notas[0] = 10;
    Aluno a = new Aluno("dudu", "10", "10", notas, "oi");
    int opc = 0;

    do {
      System.out.println("""
                   1 – Cadastrar Aluno (Verificar se o aluno já foi cadastrado)
           2 – Cadastrar Professor (Verificar se o Professor já foi cadastrado)
           3 – Obter Média do Aluno
           4 – Obter Salario do Professor
           5 – Obter informações do Aluno (Utilizar o método toString())
           6 – Obter informações do professor (Utilizar o método toString())
           0 – Sair
                                    """);
      opc = sc.nextInt();

      try {

        switch (opc) {
          case 1:
            throw new Exception("Testando exceção");
          // break;
          case 2:
            System.out.println(a.getMedia());
            break;
          default:
            System.out.println("Número inválido!");
        }
      } catch (Exception e) {
        System.out.println(e);

      }

    } while (opc != -1);

    sc.close();
  }

}