package exercicios.lista_de_exercicios_10_interfaces.questao_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios.lista_de_exercicios_10_interfaces.questao_01.classes.Circle;
import exercicios.lista_de_exercicios_10_interfaces.questao_01.classes.Rectangle;
import exercicios.lista_de_exercicios_10_interfaces.questao_01.interfaces.Geometric;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int option;
    double radius;
    double width;
    double height;

    List<Geometric> geometricList = new ArrayList<Geometric>();

    do {
      System.out.println("1. Adicionar um Círculo;");
      System.out.println("2. Adicionar um Retângulo;");
      System.out.println("3. Calcular média das áreas;");
      System.out.println("4. Calcular média dos perímetros;");
      System.out.println("0. Sair");
      System.out.print("Opção: ");
      option = scan.nextInt();

      switch (option) {
        case 1:
          System.out.print("Raio: ");
          radius = scan.nextDouble();
          geometricList.add(new Circle(radius));
          break;
        case 2:
          System.out.print("Largura: ");
          width = scan.nextDouble();
          System.out.print("Altura: ");
          height = scan.nextDouble();
          geometricList.add(new Rectangle(width, height));
          break;
        case 3:
          System.out.println("Média das áreas: " + getAverageArea(geometricList));
          break;
        case 4:
          System.out.println("Média dos perímetros: " + getAveragePerimeter(geometricList));
          break;
        case 0:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida!");
          break;

      }
    } while (option != 0);
    scan.close();
  }

  public static double getAverageArea(List<Geometric> geometricList) {
    double sum = 0;
    for (Geometric geometric : geometricList) {
      sum += geometric.getArea();
    }
    return sum / geometricList.size();
  }
    
  public static double getAveragePerimeter(List<Geometric> geometricList) {
    double sum = 0;
    for (Geometric geometric : geometricList) {
      sum += geometric.getPerimeter();
    }
    return sum / geometricList.size();
  }

}
