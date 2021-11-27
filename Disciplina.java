package CheckpointPoo;

public class Disciplina {
    private String nomeDisciplina;
    private String descricao;
    private String cargaHoraria;

    public Disciplina(String nomeDisciplina, String descricao, String cargaHoraria) {
        this.nomeDisciplina = nomeDisciplina;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

}
