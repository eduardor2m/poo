package exercicios.lista_de_exercicios_10_interfaces.questao_01.classes;

import exercicios.lista_de_exercicios_10_interfaces.questao_01.interfaces.Geometric;

public class Rectangle implements Geometric {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getArea() {
    return this.width * this.height;
  }

  public double getPerimeter() {
    return 2 * (this.width + this.height);
  }
}
