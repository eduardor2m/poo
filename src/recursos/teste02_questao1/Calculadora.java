package recursos.teste02_questao1;

import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int opc = 0;

    do {
      opc = sc.nextInt();

      try {
        switch (opc) {
          case 1:
            double n1 = 10;
            double n2 = 20;
            somar(n1, n2);
            break;

          case 2:
            n1 = 10;
            n2 = 0;
            dividir(n1, n2);
            break;
        }
      }

      catch (IllegalArgumentException e) {
        System.out.println("deu erro: " + e.getMessage());
      }
      ;
    } while (opc != -1);

    sc.close();
  }

  public static void somar(double n1, double n2) {
    System.out.println(n1 + n2);
  }

  public static void dividir(double n1, double n2) {
    if (n2 <= 0) {
      throw new IllegalArgumentException("nao pode 0");
    }
    System.out.println(n1 / n2);
  }
}
