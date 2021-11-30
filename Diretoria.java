package CheckpointPoo;

public class Diretoria extends Pessoa{

    private double salario;

    public Diretoria(String nome, String sobrenome, String cpf, String numeroCelular, String endereco, double salario) {
        super(nome, sobrenome, cpf, numeroCelular, endereco);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void administrarFinanceiro(){
                System.out.println("Diretor(a) " + getNome() + " " + getSobrenome()+ " administra o financeiro.");
    }
}
