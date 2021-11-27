package CheckpointPoo;

public class Turma {

    private String codigo;
    private Disciplina disciplina;
    private int quantAulaOnline;
    private int getQuantAulaPresencial;

    public Turma(String codigo, Disciplina disciplina, int quantAulaOnline, int getQuantAulaPresencial) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.quantAulaOnline = quantAulaOnline;
        this.getQuantAulaPresencial = getQuantAulaPresencial;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getQuantAulaOnline() {
        return quantAulaOnline;
    }

    public void setQuantAulaOnline(int quantAulaOnline) {
        this.quantAulaOnline = quantAulaOnline;
    }

    public int getGetQuantAulaPresencial() {
        return getQuantAulaPresencial;
    }

    public void setGetQuantAulaPresencial(int getQuantAulaPresencial) {
        this.getQuantAulaPresencial = getQuantAulaPresencial;
    }

    public void pesquisarCodigo(){
        System.out.println("O código da turma é " + getCodigo() + ".");
    }
    public void pesquisarDisciplina(){
        System.out.println("A turma possui a disciplina de " + disciplina.getNomeDisciplina() + ".");
    }

}

