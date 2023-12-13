package recursos.revisao_excecoes;

public class AlunoJaCadastradoException extends IllegalArgumentException {

    public AlunoJaCadastradoException() {
    }

    public AlunoJaCadastradoException(String s) {
        super(s);
    }
}
