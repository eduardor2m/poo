package exercicios.lista_de_exercicios_10_interfaces.questao_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios.lista_de_exercicios_10_interfaces.questao_06.classes.*;

public class Main {

  static Scanner scan = new Scanner(System.in);

// • 1 – Cadastrar trabalhador Integral
// • 2 – Cadastrar trabalhador Horista
// • 3 – Obter salário trabalhador integral (pelo numero de cadastro)
// • 4 – Obter salário trabalhador horista
// • 5 – Obter ficha do trabalhador integral
// • 6 – Obter ficha do trabalhador horista
// • 7 – Obter maior salário entre os trabalhadores integrais
// • 8 – Obter maior idade entre os trabalhadores horistas
// • 0 – Sair

public static void main(String[] args) {
  int option = -1;
  String name;
  String registration;
  double salary;
  int age;
  String adress;
  int hoursWorked;

  List<Worker> workers = new ArrayList<Worker>();

  while (option != 0) {
    System.out.println("""
        1 – Cadastrar trabalhador Integral
        2 – Cadastrar trabalhador Horista
        3 – Obter salário trabalhador integral (pelo numero de cadastro)
        4 – Obter salário trabalhador horista
        5 – Obter ficha do trabalhador integral
        6 – Obter ficha do trabalhador horista
        7 – Obter maior salário entre os trabalhadores integrais
        8 – Obter maior idade entre os trabalhadores horistas
        0 – Sair
        """);
    option = scan.nextInt();
    switch (option) {
      case 1:
        System.out.println("Digite o Nome do trabalhador: ");
        name = scan.next();
        System.out.println("Digite a matrícula do trabalhador: ");
        registration = scan.next();
        System.out.println("Digite o salário do trabalhador: ");
        salary = scan.nextDouble();
        System.out.println("Digite a idade do trabalhador: ");
        age = scan.nextInt();
        System.out.println("Digite o endereço do trabalhador: ");
        adress = scan.next();
        workers.add(new FullTimeWorker(name, registration, salary, age, adress));
        break;
      case 2:
        System.out.println("Digite o Nome do trabalhador: ");
        name = scan.next();
        System.out.println("Digite a matrícula do trabalhador: ");
        registration = scan.next();
        System.out.println("Digite o salário do trabalhador: ");
        salary = scan.nextDouble();
        System.out.println("Digite a idade do trabalhador: ");
        age = scan.nextInt();
        System.out.println("Digite o endereço do trabalhador: ");
        adress = scan.next();
        System.out.println("Digite as horas trabalhadas do trabalhador: ");
        hoursWorked = scan.nextInt();
        workers.add(new HourlyWorker(name, registration, salary, age, adress, hoursWorked));
        break;
      case 3:
        System.out.println("Digite o número de matrícula do trabalhador: ");
        registration = scan.next();
        for (Worker worker : workers) {
          if (worker.getRegistration().equals(registration)) {
            System.out.println(" O salário do trabalhador é: " + worker.getSalary());
          }
        }
        break;
      case 4:
        System.out.println("Digite o número de matrícula do trabalhador: ");
        registration = scan.next();
        for (Worker worker : workers) {
          if (worker.getRegistration().equals(registration)) {
            System.out.println(" O salário do trabalhador é: " + worker.getSalary());
          }
        }
        break;
      case 5:
        System.out.println("Digite o número de matrícula do trabalhador: ");
        registration = scan.next();
        for (Worker worker : workers) {
          if (worker.getRegistration().equals(registration)) {
            System.out.println(worker);
          }
        }
        break;
      case 6:
        System.out.println("Digite o número de matrícula do trabalhador: ");
        registration = scan.next();
        for (Worker worker : workers) {
          if (worker.getRegistration().equals(registration)) {
            System.out.println(worker);
          }
        }
        break;
      case 7:
        double maxSalary = 0;
        for (Worker worker : workers) {
          if (worker.getSalary() > maxSalary) {
            maxSalary = worker.getSalary();
          }
        }
        System.out.println("O maior salário entre os trabalhadores integrais é: " + maxSalary);
        break;
      case 8:
        int maxAge = 0;
        for (Worker worker : workers) {
          if (worker.getAge() > maxAge) {
            maxAge = worker.getAge();
          }
        }
        System.out.println("A maior idade entre os trabalhadores horistas é: " + maxAge);
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
