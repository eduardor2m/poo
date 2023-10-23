package exercicios.lista_de_exercicios_10_interfaces.questao_01.classes;

import exercicios.lista_de_exercicios_10_interfaces.questao_01.interfaces.Geometric;

public class Circle implements Geometric {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * Math.pow(this.radius, 2);
  }

  public double getPerimeter() {
    return 2 * Math.PI * this.radius;
  }
  
}
