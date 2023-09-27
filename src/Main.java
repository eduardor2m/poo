import classes.Funcionary;
import classes.Manager;
import classes.Person;

public class Main {
  public static void main(String[] args) {
    Person person = new Person("John", "123.456.789-00", "01/01/2000");
    Person funcionary = new Funcionary("John", "123.456.789-00", "01/01/2000", 2.000);
    Person manager = new Manager("John", "123.456.789-00", "01/01/2000", 2.000);
  }

}