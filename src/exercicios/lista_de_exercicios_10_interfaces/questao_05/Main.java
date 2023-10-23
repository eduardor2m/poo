package exercicios.lista_de_exercicios_10_interfaces.questao_05;

import java.util.ArrayList;
import java.util.Scanner;

import exercicios.lista_de_exercicios_10_interfaces.questao_05.Classes.*;

public class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();

		int option = -1;
		String name;
		String cpf;
		String birthDate;
		double salary;
		String department;

		while (option != 0) {
			System.out.println("""
					1. Adicionar Funcionário
					2. Adicionar Gerente
					3. Obter salário de Funcionário
					4. Obter salário Gerente
					0. Sair
					""");
			option = scan.nextInt();
			switch (option) {
				case 1:
					System.out.println("Digite o Nome do funcionário: ");
					name = scan.next();
					System.out.println("Digite o CPF do funcionário: ");
					cpf = scan.next();
					System.out.println("Digite a data de nascimento do funcionário: ");
					birthDate = scan.next();
					System.out.println("Digite o salário do funcionário: ");
					salary = scan.nextDouble();
					employees.add(new Employee(name, cpf, birthDate, salary));
					break;
				case 2:
					System.out.println("Digite o Nome do gerente: ");
					name = scan.next();
					System.out.println("Digite o CPF do gerente: ");
					cpf = scan.next();
					System.out.println("Digite a data de nascimento do gerente: ");
					birthDate = scan.next();
					System.out.println("Digite o salário do gerente: ");
					salary = scan.nextDouble();
					System.out.println("Digite o departamento do gerente: ");
					department = scan.next();
					employees.add((Employee) new Manager(name, cpf, birthDate, salary, department));
					break;
				case 3:
					System.out.println("Digite o Nome do funcionário: ");
					name = scan.next();
					for (Employee employee : employees) {
						if (employee.getName().equals(name)) {
							System.out.println(employee.getSalary());
						}
					}
					break;
				case 4:
					System.out.println("Digite o Nome do gerente: ");
					name = scan.next();
					for (Employee employee : employees) {
						if (employee.getName().equals(name)) {
							System.out.println(employee.getSalary());
						}
					}
					break;
				case 0:
					break;
				default:
					System.out.println("Opção inválida");
					break;

			}
		}

	}
}