package recursos.revisao_excecoes;

public class NotaInvalidaException extends IllegalArgumentException {

    public NotaInvalidaException() {
        super();
    }

    public NotaInvalidaException(String message) {
        super(message);
    }
}
