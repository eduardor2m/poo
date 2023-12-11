package recursos.primeira_prova;

import java.util.ArrayList;
import java.util.List;

import recursos.primeira_prova.classes.Person;
import recursos.primeira_prova.classes.Work;

public class Main {
  public static void main(String[] args) {
    List<Person> ps = new ArrayList<Person>();

    for (int i = 0; i < 10; i++) {
      Person p = new Work("nome" + i, i);
      ps.add(p);
    }

    for (Person p : ps) {
      p.message();
      Work pWork = (Work) p;
      pWork.message("teste");
      System.out.println(p.getName());
    }

  }
}