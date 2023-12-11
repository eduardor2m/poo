package recursos.primeira_prova.classes;

public class Work extends Person {

  public Work(String name, int age) {
    super(name, age);
  }

  // @Override
  public void message(String msg) {
    System.out.println("message in work class " + msg);
  }
}
