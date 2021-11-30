package CheckpointPoo;

import java.util.List;

//Class Professor herdou atributos da class Funcionario

public class Professor extends Funcionario{
    private String titulo;

    public Professor(String nome, String sobrenome, String cpf, String numeroCelular, String endereco, int numeroRegistro, String cargo, double salario, String titulo) {
        super(nome, sobrenome, cpf, numeroCelular, endereco, numeroRegistro, cargo, salario);
        this.titulo = titulo;
    }

//Método subescrito da class Funcionario

    @Override
    public void baterPonto(double horas) {
        double total = 6.00;
        if(horas < total) {
            System.out.println("Professor(a), você ainda precisa trabalhar " + (total - horas) + " horas hoje.");
        } else {
            System.out.println("Professor(a) seu turno foi completo, até amamhã.");
        }
    }

    @Override
    public void entregarRelatorio(int quantidade) {
        int total = 4;
        if(quantidade < total){
            System.out.println("Professor(a), faltam entregar " + (total - quantidade) + " relatórios de aula");
        }else {
            System.out.println("Professor(a), relatórios entregues.");
        }
    }

    public void avaliarAluno(List<Aluno> alunos){
        for (Aluno aluno : alunos) {
            if (aluno.getNota() >= 7) {
                System.out.println("Aluno matriculado: " + aluno.getMatricula() + " - " + aluno.getNome() + " " + aluno.getSobrenome() + ", parabéns você foi aprovado(a).");
            } else {
                System.out.println("Aluno matriculado: " + aluno.getMatricula() + " - " + aluno.getNome() + " " + aluno.getSobrenome() + ". Sua nota foi abaixo da média, precisa estudar mais.");
            }
        }
    }
}
