package CheckpointPoo;

public class Funcionario extends Pessoa{
    protected int numeroRegistro;
    protected String cargo;
    protected double salario;

    public Funcionario(String nome, String sobrenome, int cpf, int numeroCelular, String endereco, int numeroRegistro, String cargo, double salario) {
        super(nome, sobrenome, cpf, numeroCelular, endereco);
        this.numeroRegistro = numeroRegistro;
        this.cargo = cargo;
        this.salario = salario;
    }
}


