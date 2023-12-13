package recursos.revisao_excecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int opc;

        do {
            System.out.print("Digite a opc: ");
            opc = scan.nextInt();

            if (opc == 1) {
                try {
                    System.out.print("Digite o cpf: ");
                    String cpf = scan.nextLine();

                    System.out.print("Digite o nome: ");
                    String nome = scan.nextLine();

                    System.out.print("Digite o data nasc: ");
                    String dataNasc = scan.nextLine();

                    System.out.print("Digite a nota 1: ");
                    double nota1 = scan.nextDouble();
                    validarNota(nota1);

                    System.out.print("Digite a nota 2: ");
                    double nota2 = scan.nextDouble();
                    validarNota(nota2);

                    System.out.print("Digite a nota 3: ");
                    double nota3 = scan.nextDouble();
                    validarNota(nota3);

                    System.out.print("Digite a nota 4: ");
                    double nota4 = scan.nextDouble();
                    validarNota(nota4);

                    Aluno alunoCadastro = new Aluno(cpf, nome, dataNasc, nota1, nota2, nota3, nota4);

                    for (Aluno a : alunos) {
                        // if (a.getCpf() == aluno.getCpf()) {
                        if (a.getCpf().equals(alunoCadastro.getCpf())) {
                            throw new AlunoJaCadastradoException("Aluno já cadastrado!");
                        }
                    }

                    alunos.add(alunoCadastro);
                } catch (NotaInvalidaException e) {
                    System.out.println("Nota Invalida!");
                } catch (AlunoJaCadastradoException e) {
                    System.out.println(e.getMessage());
                }
            } else if (opc == 3) {
                System.out.print("Digite o cpf: ");
                String cpf = scan.nextLine();
                for (Aluno aluno : alunos) {
                    if (aluno.getCpf().equals(cpf)) {
                        System.out.println("A media é: " + aluno.calcMedia());
                    }
                }
            }

        } while (opc != 0);
    }

    private static void validarNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new NotaInvalidaException();
        }
    }

}
