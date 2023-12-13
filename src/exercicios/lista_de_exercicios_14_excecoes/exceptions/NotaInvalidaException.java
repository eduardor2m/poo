package exercicios.lista_de_exercicios_14_excecoes.exceptions;

public class NotaInvalidaException extends IllegalArgumentException {

  public NotaInvalidaException() {
    super();
  }

  public NotaInvalidaException(String message) {
    super(message);
  }

}
