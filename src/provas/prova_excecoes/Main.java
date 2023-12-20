package provas.prova_excecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import provas.prova_excecoes.classes.Trabalhador;
import provas.prova_excecoes.classes.TrabalhadorHorista;
import provas.prova_excecoes.classes.TrabalhadorIntegral;
import provas.prova_excecoes.exceptions.TrabalhadorNaoEncontradoException;
import provas.prova_excecoes.exceptions.ValorInvalidoException;

public class Main {
  public static void main(String[] args) {
    List<Trabalhador> trabalhadores = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    int opc = -1;

    do {
      System.out.println("Digite a opção: ");
      opc = sc.nextInt();

      try {
        switch (opc) {
          case 1:
            System.out.println("Digite o nome do trabalhador: ");
            String name = sc.next();
            for (Trabalhador trabalhador : trabalhadores) {
              if (trabalhador.getName().equals(name)) {
                throw new TrabalhadorNaoEncontradoException();
              }
            }
            System.out.println("Digite o salário do trabalhador: ");
            double salario = sc.nextDouble();
            if (salario < 0) {
              throw new ValorInvalidoException("Salário não pode ser negativo");
            }
            System.out.println("Digite a idade do trabalhador: ");
            int idade = sc.nextInt();
            System.out.println("Digite as horas trabalhadas do trabalhador: ");
            int horasTrabalhadas = sc.nextInt();

            Trabalhador trabalhadorHorista = new TrabalhadorHorista(name, salario, idade, horasTrabalhadas);

            trabalhadores.add(trabalhadorHorista);
            break;
          case 2:
            System.out.println("Digite o nome do trabalhador: ");
            name = sc.next();
            for (Trabalhador trabalhador : trabalhadores) {
              if (trabalhador.getName().equals(name)) {
                throw new TrabalhadorNaoEncontradoException();
              }
            }
            System.out.println("Digite o salário do trabalhador: ");
            salario = sc.nextDouble();
            if (salario < 0) {
              throw new ValorInvalidoException("Salário não pode ser negativo");
            }
            System.out.println("Digite a idade do trabalhador: ");
            idade = sc.nextInt();

            Trabalhador trabalhadorIntegral = new TrabalhadorIntegral(name, salario, idade);
            trabalhadores.add(trabalhadorIntegral);
            break;
          case 3:
            System.out.println("Digite o nome do trabalhador que você quer encontrar: ");
            name = sc.next();

            for (Trabalhador trabalhador : trabalhadores) {
              if (trabalhador.getName().equals(name)) {
                System.out.println(trabalhador.calcSalario());
              }
            }
            break;

          default:
            System.out.println("Opção inválida");
            break;
        }
      } catch (ValorInvalidoException e) {
        System.out.println(e.getMessage());
      } catch (TrabalhadorNaoEncontradoException e) {
        System.out.println(e.getMessage());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }

    } while (opc != 0);

    sc.close();
  }
}