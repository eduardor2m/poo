package exercicios.lista_de_exercicios_14_excecoes.questao_03;

import exercicios.lista_de_exercicios_14_excecoes.questao_03.classes.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
  private static ArrayList<Aluno> alunos = new ArrayList<>();
  private static ArrayList<Professor> professores = new ArrayList<>();
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int opcao;
    do {
      exibirMenu();
      System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();
      scanner.nextLine(); // Consumir a quebra de linha

      try {
        switch (opcao) {
          case 1:
            cadastrarAluno();
            break;
          case 2:
            cadastrarProfessor();
            break;
          case 3:
            obterMediaDoAluno();
            break;
          case 4:
            obterSalarioDoProfessor();
            break;
          case 5:
            obterInformacoesDoAluno();
            break;
          case 6:
            obterInformacoesDoProfessor();
            break;
          case 0:
            System.out.println("Saindo do programa. Até logo!");
            break;
          default:
            System.out.println("Opção inválida. Tente novamente.");
            break;
        }
      } catch (InputMismatchException e) {
        System.out.println("Entrada inválida. Por favor, insira um número.");
        scanner.nextLine(); // Limpar o buffer do scanner
      } catch (Exception e) {
        System.out.println("Erro: " + e.getMessage());
      }
    } while (opcao != 0);
  }

  private static void exibirMenu() {
    System.out.println("\n===== MENU =====");
    System.out.println("1 - Cadastrar Aluno");
    System.out.println("2 - Cadastrar Professor");
    System.out.println("3 - Obter Média do Aluno");
    System.out.println("4 - Obter Salário do Professor");
    System.out.println("5 - Obter Informações do Aluno");
    System.out.println("6 - Obter Informações do Professor");
    System.out.println("0 - Sair");
  }

  private static void cadastrarAluno() throws Exception {
    System.out.print("Nome do Aluno: ");
    String nome = scanner.nextLine();
    System.out.print("CPF do Aluno: ");
    String cpf = scanner.nextLine();
    System.out.print("Data de Nascimento do Aluno: ");
    String dataNascimento = scanner.nextLine();

    if (alunoJaCadastrado(cpf)) {
      throw new Exception("Aluno já cadastrado.");
    }

    Aluno aluno = new Aluno(nome, cpf, dataNascimento);

    for (int i = 0; i < 4; i++) {
      System.out.print("Nota " + (i + 1) + ": ");
      double nota = scanner.nextDouble();
      aluno.setNota(i, nota);
    }

    alunos.add(aluno);
    System.out.println("Aluno cadastrado com sucesso!");
  }

  private static void cadastrarProfessor() throws Exception {
    System.out.print("Nome do Professor: ");
    String nome = scanner.nextLine();
    System.out.print("CPF do Professor: ");
    String cpf = scanner.nextLine();
    System.out.print("Data de Nascimento do Professor: ");
    String dataNascimento = scanner.nextLine();
    System.out.print("Salário do Professor: ");
    double salario = scanner.nextDouble();

    if (professorJaCadastrado(cpf)) {
      throw new Exception("Professor já cadastrado.");
    }

    Professor professor = new Professor(nome, cpf, dataNascimento, salario);
    professores.add(professor);
    System.out.println("Professor cadastrado com sucesso!");
  }

  private static void obterMediaDoAluno() throws Exception {
    System.out.print("CPF do Aluno: ");
    String cpf = scanner.nextLine();

    Aluno aluno = buscarAlunoPorCPF(cpf);

    if (aluno != null) {
      double media = aluno.calcularMedia();
      System.out.println("Média do Aluno: " + media);
    } else {
      throw new Exception("Aluno não encontrado.");
    }
  }

  private static void obterSalarioDoProfessor() throws Exception {
    System.out.print("CPF do Professor: ");
    String cpf = scanner.nextLine();

    Professor professor = buscarProfessorPorCPF(cpf);

    if (professor != null) {
      double salario = professor.getSalario();
      System.out.println("Salário do Professor: " + salario);
    } else {
      throw new Exception("Professor não encontrado.");
    }
  }

  private static void obterInformacoesDoAluno() throws Exception {
    System.out.print("CPF do Aluno: ");
    String cpf = scanner.nextLine();

    Aluno aluno = buscarAlunoPorCPF(cpf);

    if (aluno != null) {
      System.out.println(aluno.toString());
    } else {
      throw new Exception("Aluno não encontrado.");
    }
  }

  private static void obterInformacoesDoProfessor() throws Exception {
    System.out.print("CPF do Professor: ");
    String cpf = scanner.nextLine();

    Professor professor = buscarProfessorPorCPF(cpf);

    if (professor != null) {
      System.out.println(professor.toString());
    } else {
      throw new Exception("Professor não encontrado.");
    }
  }

  private static boolean alunoJaCadastrado(String cpf) {
    for (Aluno aluno : alunos) {
      if (aluno.getCPF().equals(cpf)) {
        return true;
      }
    }
    return false;
  }

  private static boolean professorJaCadastrado(String cpf) {
    for (Professor professor : professores) {
      if (professor.getCPF().equals(cpf)) {
        return true;
      }
    }
    return false;
  }

  private static Aluno buscarAlunoPorCPF(String cpf) {
    for (Aluno aluno : alunos) {
      if (aluno.getCPF().equals(cpf)) {
        return aluno;
      }
    }
    return null;
  }

  private static Professor buscarProfessorPorCPF(String cpf) {
    for (Professor professor : professores) {
      if (professor.getCPF().equals(cpf)) {
        return professor;
      }
    }
    return null;
  }
}