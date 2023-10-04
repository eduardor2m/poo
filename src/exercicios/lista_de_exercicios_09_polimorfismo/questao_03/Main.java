package exercicios.lista_de_exercicios_09_polimorfismo.questao_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios.lista_de_exercicios_09_polimorfismo.questao_03.classes.FullTimeWorker;
import exercicios.lista_de_exercicios_09_polimorfismo.questao_03.classes.HourlyWorker;
import exercicios.lista_de_exercicios_09_polimorfismo.questao_03.classes.Worker;

public class Main {
  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
    List<Worker> fullTimeWorkers = new ArrayList<>();
    List<Worker> hourlyWorkers = new ArrayList<>();

// • 1 – Cadastrar trabalhador Integral
// • 2 – Cadastrar trabalhador Horista
// • 3 – Obter salário trabalhador integral (pelo numero de cadastro)
// • 4 – Obter salário trabalhador horista
// • 5 – Obter ficha do trabalhador integral
// • 6 – Obter ficha do trabalhador horista
// • 7 – Obter maior salário entre os trabalhadores integrais
// • 8 – Obter maior idade entre os trabalhadores horistas
// • 0 – SAIR

    int option = 0;
    do {
      System.out.println("1 – Cadastrar trabalhador Integral");
      System.out.println("2 – Cadastrar trabalhador Horista");
      System.out.println("3 – Obter salário trabalhador integral (pelo numero de cadastro)");
      System.out.println("4 – Obter salário trabalhador horista");
      System.out.println("5 – Obter ficha do trabalhador integral");
      System.out.println("6 – Obter ficha do trabalhador horista");
      System.out.println("7 – Obter maior salário entre os trabalhadores integrais");
      System.out.println("8 – Obter maior idade entre os trabalhadores horistas");
      System.out.println("0 – SAIR");
      System.out.print("Opção: ");
      option = scan.nextInt();
      scan.nextLine();

      switch (option) {
        case 1:
          System.out.print("Nome: ");
          String name = scan.nextLine();
          System.out.print("Matrícula: ");
          String register = scan.nextLine();
          System.out.print("Salário: ");
          double salary = scan.nextDouble();
          System.out.print("Idade: ");
          int age = scan.nextInt();
          scan.nextLine();
          System.out.print("Endereço: ");
          String adress = scan.nextLine();

          fullTimeWorkers.add(new FullTimeWorker(name, register, salary, age, adress));
          break;
        case 2:
          System.out.print("Nome: ");
          name = scan.nextLine();
          System.out.print("Matrícula: ");
          register = scan.nextLine();
          System.out.print("Salário: ");
          salary = scan.nextDouble();
          System.out.print("Idade: ");
          age = scan.nextInt();
          scan.nextLine();
          System.out.print("Endereço: ");
          adress = scan.nextLine();
          System.out.print("Valor da hora: ");
          double hourValue = scan.nextDouble();
          System.out.print("Horas trabalhadas: ");
          double workedHours = scan.nextDouble();

          hourlyWorkers.add(new HourlyWorker(name, register, salary, age, adress, hourValue, workedHours));
          break;
        case 3:
          System.out.print("Matrícula: ");
          register = scan.nextLine();

          for (Worker worker : fullTimeWorkers) {
            if (worker.getRegister().equals(register)) {
              System.out.println(" Salário: " + worker.getSalary());
            }
          }
          break;
        case 4: 
          System.out.print("Matrícula: ");
          register = scan.nextLine();

          for (Worker worker : hourlyWorkers) {
            if (worker.getRegister().equals(register)) {
              System.out.println(" Salário: " + worker.getSalary());
            }
          }
          break;
        case 5: 
          System.out.print("Matrícula: ");
          register = scan.nextLine();

          for (Worker worker : fullTimeWorkers) {
            if (worker.getRegister().equals(register)) {
              System.out.println("Ficha: " + worker.getName());
              System.out.println("Matrícula: " + worker.getRegister());
              System.out.println("Salário: " + worker.getSalary());
              System.out.println("Idade: " + worker.getAge());
              System.out.println("Endereço: " + worker.getAdress());       
            }
          }
          break;
        case 6: 
          System.out.print("Matrícula: ");
          register = scan.nextLine();

          for (Worker worker : hourlyWorkers) {
            if (worker.getRegister().equals(register)) {
              System.out.println("Ficha: " + worker.getName());
              System.out.println("Matrícula: " + worker.getRegister());
              System.out.println("Salário: " + worker.getSalary());
              System.out.println("Idade: " + worker.getAge());
              System.out.println("Endereço: " + worker.getAdress());
            }
          }
          break;
        case 7: 
          double maxSalary = 0;
          for (Worker worker : fullTimeWorkers) {
            if (worker.getSalary() > maxSalary) {
              maxSalary = worker.getSalary();
            }
          }
          System.out.println("Maior salário: " + maxSalary);
          break;
        case 8:
          int maxAge = 0;
          for (Worker worker : hourlyWorkers) {
            if (worker.getAge() > maxAge) {
              maxAge = worker.getAge();
            }
          }
          System.out.println("Maior idade: " + maxAge);
          break;
        case 0:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida!");
          break;
        }
      } while (option != 0);
  }
}