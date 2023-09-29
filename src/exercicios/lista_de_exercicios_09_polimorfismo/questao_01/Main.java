package exercicios.lista_de_exercicios_09_polimorfismo.questao_01;

import exercicios.lista_de_exercicios_09_polimorfismo.questao_01.classes.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<Person>();
    // Manager manager = new Manager("John Doe", "123.456.789-00", "01/01/2000", 10000, "IT");
    // System.out.println("Name: " + manager.getName());
    // System.out.println("CPF: " + manager.getCPF());
    // System.out.println("Birthdate: " + manager.getBirthdate());
    // System.out.println("Salary: " + manager.getSalary());
    // System.out.println("Department: " + manager.getDepartment());

    int opc = -1;

    while (opc != 0) {
      System.out.println("1 - Add funcionary");
      System.out.println("2 - Add manager");
      System.out.println("3 - Show salary funcionary");
      System.out.println("4 - Show salary manager");
      System.out.println("0 - Exit");
      System.out.print("Option: ");
      opc = scanner.nextInt();
      scanner.nextLine();

      switch (opc) {
        case 1:
          System.out.print("Name: ");
          String name = scanner.nextLine();
          System.out.print("CPF: ");
          String CPF = scanner.nextLine();
          System.out.print("Birthdate: ");
          String birthdate = scanner.nextLine();
          System.out.print("Salary: ");
          double salary = scanner.nextDouble();
          scanner.nextLine();
          people.add(new Funcionary(name, CPF, birthdate, salary));
          break;
        case 2:
          System.out.print("Name: ");
          name = scanner.nextLine();
          System.out.print("CPF: ");
          CPF = scanner.nextLine();
          System.out.print("Birthdate: ");
          birthdate = scanner.nextLine();
          System.out.print("Salary: ");
          salary = scanner.nextDouble();
          scanner.nextLine();
          System.out.print("Department: ");
          String department = scanner.nextLine();
          people.add(new Manager(name, CPF, birthdate, salary, department));
          break;
        case 3:
          System.out.print("CPF: ");
          CPF = scanner.nextLine();
          for (Person person : people) {
            if (person.getCPF().equals(CPF)) {
              System.out.println("Salary: " + ((Funcionary) person).getSalary());
            }
          }
          break;
        case 4:
          System.out.print("CPF: ");
          CPF = scanner.nextLine();
          for (Person person : people) {
            if (person.getCPF().equals(CPF)) {
              System.out.println("Salary: " + ((Manager) person).getSalary());
            }
          }
          break;
        case 0:
          System.out.println("Bye!");
          break;
        default:
          System.out.println("Invalid option!");
          break;
      }
    }
  
      

  }
}
