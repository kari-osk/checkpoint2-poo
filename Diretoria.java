package CheckpointPoo;

public class Diretoria extends Pessoa{

    private double salario;

    public Diretoria(String nome, String sobrenome, int cpf, int numeroCelular, String endereco, double salario) {
        super(nome, sobrenome, cpf, numeroCelular, endereco);
        this.salario = salario;
    }


       public void administrarFinanceiro(){
                System.out.println("Diretor(a) " + getNome() + " " + getSobrenome()+ " administra o financeiro.");
    }
}
