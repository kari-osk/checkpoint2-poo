package CheckpointPoo;

public class Aluno extends Pessoa {
    private String matricula;
    private int nota;
    private Turma turma;

    public Aluno(String nome, String sobrenome, String cpf, String numeroCelular, String endereco, String matricula, int nota, Turma turma) {
        super(nome, sobrenome, cpf, numeroCelular, endereco);
        this.matricula = matricula;
        this.nota = nota;
        this.turma = turma;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
