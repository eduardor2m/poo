package recursos.primeira_prova.classes;

public abstract class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void message() {
    System.out.println("message in abstract class");
  }
}