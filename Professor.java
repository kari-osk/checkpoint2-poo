package CheckpointPoo;

import java.util.List;

public class Professor extends Funcionario{
    private String titulo;

    public Professor(String nome, String sobrenome, int cpf, int numeroCelular, String endereco, int numeroRegistro, String cargo, double salario, String titulo) {
        super(nome, sobrenome, cpf, numeroCelular, endereco, numeroRegistro, cargo, salario);
        this.titulo = titulo;
    }


    public void avaliar(List<Aluno> alunos){
        for (Aluno aluno : alunos) {
            if (aluno.getNota() >= 7) {
                System.out.println("Aluno matriculado: " + aluno.getMatricula() + " - " + aluno.getNome() + " " + aluno.getSobrenome() + ", parabéns você foi aprovado(a).");
            } else {
                System.out.println("Aluno matriculado: " + aluno.getMatricula() + " - " + aluno.getNome() + " " + aluno.getSobrenome() + ". Sua nota foi abaixo da média, precisa estudar mais.");
            }
        }
    }
}
