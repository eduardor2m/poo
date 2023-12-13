package recursos.segunda_prova;

import java.util.Scanner;

import recursos.segunda_prova.classes.Calculadora;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static Calculadora calc = new Calculadora();

  public static void main(String[] args) {
    double n1, n2;

    try {
      n1 = 10;
      n2 = 0;
      calc.dividir(n1, n2);
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}