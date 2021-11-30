package CheckpointPoo;

//Class Funcionario herdou atributos da superclass Pessoa

public class Funcionario extends Pessoa{
    protected int numeroRegistro;
    protected String cargo;
    protected double salario;

    public Funcionario(String nome, String sobrenome, String cpf, String numeroCelular, String endereco, int numeroRegistro, String cargo, double salario) {
        super(nome, sobrenome, cpf, numeroCelular, endereco);
        this.numeroRegistro = numeroRegistro;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

//Métodos serão subescritos em Professores e Administradores

    public void baterPonto(double horas){}

    public void entregarRelatorio(int quantidade){}
}


