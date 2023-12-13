package recursos.revisao_excecoes;

public class Professor extends Pessoa {
    private double salario;

    public Professor(String cpf, String nome, String dataNasc, double salario) {
        super(cpf, nome, dataNasc);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
