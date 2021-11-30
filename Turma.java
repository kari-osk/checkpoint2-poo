package CheckpointPoo;

import java.util.Scanner;

public class Turma {
    private String codigo;
    private Scanner disciplina;
    private int quantAulaOnline;
    private int getQuantAulaPresencial;

    public Turma(String codigo, Scanner disciplina, int quantAulaOnline, int getQuantAulaPresencial) {
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

    public Scanner getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Scanner disciplina) {
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

//  Método para pesquisar o dódigo da turma:

    public void pesquisarCodigo(){
        System.out.println("O código da turma é " + getCodigo() + ".");
    }
}

