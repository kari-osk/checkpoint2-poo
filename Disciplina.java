package CheckpointPoo;

public class Disciplina {
    private String nomeDisciplina;
    private String descricao;
    private int quantTotalAulas;

    public Disciplina(String nomeDisciplina, String descricao, int quantTotalAulas) {
        this.nomeDisciplina = nomeDisciplina;
        this.descricao = descricao;
        this.quantTotalAulas = quantTotalAulas;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantTotalAulas() {
        return quantTotalAulas;
    }

    public void setQuantTotalAulas(int quantTotalAulas) {
        this.quantTotalAulas = quantTotalAulas;
    }
}
