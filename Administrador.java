package CheckpointPoo;

import java.util.Scanner;

public class Administrador extends Funcionario{

    public Administrador(String nome, String sobrenome, int cpf, int numeroCelular, String endereco, int numeroRegistro, String cargo, double salario) {
        super(nome, sobrenome, cpf, numeroCelular, endereco, numeroRegistro, cargo, salario);
    }

    public void auxiliarFinanceiro(){
        System.out.println("Funcionário da administração auxilia a diretoria na área financeira.");
    }

    public void administrar(){
        System.out.println("Funcionário administra todos os documentos da escola");
    }

    public void cadastrar() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        this.nome = entrada.nextLine();

        System.out.println("Digite o sobrenome: ");
        this.sobrenome = entrada.nextLine();

        System.out.println("Digite o número do CPF: ");
        this.cpf = entrada.nextInt();

        System.out.println("Digite o número do telefone: ");
        this.numeroCelular = entrada.nextInt();

        System.out.println("Digite o endereço: ");
        this.endereco = entrada.nextLine();

    }
}
