package classes;
import interfaces.Shape;

public class Square implements Shape {

  private double l;
  private double h;

  public Square(double l, double h) {
    this.l = l;
    this.h = h;
  }

  public double getL() {
    return this.l;
  }

  public double getH() {
    return this.h;
  }
}