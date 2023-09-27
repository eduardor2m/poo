package classes;
import interfaces.Shape;

public abstract class Shapes {

  public static double getArea(Shape shape) {
    return shape.getL() * shape.getH();
  }

  public static double getPerimeter(Shape shape) {
    return 2 * (shape.getL() + 2 * shape.getH());
  }

}

