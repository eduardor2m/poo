package exercicios.lista_de_exercicios_14_excecoes.questao_03;

// 1 – Cadastrar Aluno (Verificar se o aluno já foi cadastrado)
// 2 – Cadastrar Professor (Verificar se o Professor já foi cadastrado)
// 3 – Obter Média do Aluno
// 4 – Obter Salario do Professor
// 5 – Obter informações do Aluno (Utilizar o método toString())
// 6 – Obter informações do professor (Utilizar o método toString())
// 0 – Sair

import exercicios.lista_de_exercicios_14_excecoes.questao_03.classes.Aluno;
import exercicios.lista_de_exercicios_14_excecoes.questao_03.classes.Pessoa;
import exercicios.lista_de_exercicios_14_excecoes.questao_03.classes.Professor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int option = -1;
    String name;
    String CPF;
    String dataDeNascimento;
    String classe;
    Double notas[];
    Double salario;

    List<Pessoa> pessoas = new ArrayList<Pessoa>();

    while (option != 0) {
      System.out.println("""
          1 - Cadastrar Aluno (Verificar se o aluno já foi cadastrado)
          2 - Cadastrar Professor (Verificar se o Professor já foi cadastrado)
          3 - Obter Média do Aluno
          4 - Obter Salario do Professor
          5 - Obter informações do Aluno (Utilizar o método toString())
          6 - Obter informações do professor (Utilizar o método toString())
          0 - Sair
          """);
      option = scan.nextInt();
      switch (option) {
        case 1:
          System.out.println("Digite o Nome do aluno: ");
          name = scan.next();
          System.out.println("Digite o CPF do aluno: ");
          CPF = scan.next();
          for (Pessoa pessoa : pessoas) {
            if (pessoa.getCPF().equals(CPF)) {
              System.out.println("Aluno já cadastrado!");
              break;
            }
          }
          System.out.println("Digite a data de nascimento do aluno: ");
          dataDeNascimento = scan.next();
          System.out.println("Digite a classe do aluno: ");
          classe = scan.next();
          System.out.println("Digite as notas do aluno: ");
          notas = new Double[4];
          for (int i = 0; i < 4; i++) {
            notas[i] = scan.nextDouble();
          }
          pessoas.add(new Aluno(name, CPF, dataDeNascimento, classe, notas));
          break;
        case 2:
          System.out.println("Digite o Nome do professor: ");
          name = scan.next();
          System.out.println("Digite o CPF do professor: ");
          CPF = scan.next();
          for (Pessoa pessoa : pessoas) {
            if (pessoa.getCPF().equals(CPF)) {
              System.out.println("Professor já cadastrado!");
              break;
            }
          }
          System.out.println("Digite a data de nascimento do professor: ");
          dataDeNascimento = scan.next();
          System.out.println("Digite o salário do professor: ");
          salario = scan.nextDouble();
          pessoas.add(new Professor(name, CPF, dataDeNascimento, salario));
          break;
        case 3:
          System.out.println("Digite o CPF do aluno: ");
          CPF = scan.next();
          for (Pessoa pessoa : pessoas) {
            if (pessoa.getCPF().equals(CPF))
              if (pessoa instanceof Aluno)
                System.out.println(((Aluno) pessoa).getMedia());
          }
          break;
        case 4:
          System.out.println("Digite o CPF do professor: ");
          CPF = scan.next();
          for (Pessoa pessoa : pessoas) {
            if (pessoa.getCPF().equals(CPF))
              if (pessoa instanceof Professor)
                System.out.println(((Professor) pessoa).getSalario());
          }
          break;
        case 5:
          System.out.println("Digite o CPF do aluno: ");
          CPF = scan.next();
          for (Pessoa pessoa : pessoas) {
            if (pessoa.getCPF().equals(CPF))
              if (pessoa instanceof Aluno)
                System.out.println(pessoa.toString());
          }
          break;
        case 6:
          System.out.println("Digite o CPF do professor: ");
          CPF = scan.next();
          for (Pessoa pessoa : pessoas) {
            if (pessoa.getCPF().equals(CPF))
              if (pessoa instanceof Professor)
                System.out.println(pessoa.toString());
          }
          break;
        case 0:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    }
  }
}