package CheckpointPoo;

import java.util.List;
import java.util.Scanner;

public class Administrador extends Funcionario{

    public Administrador(String nome, String sobrenome, int cpf, int numeroCelular, String endereco, int numeroRegistro, String cargo, double salario) {
        super(nome, sobrenome, cpf, numeroCelular, endereco, numeroRegistro, cargo, salario);
    }

    public void pagarProfessor(List<Professor>professores){
        double total = 0.00;
        for (Professor professor: professores) {
            System.out.println("Prof. codigo: " + professor.getNumeroRegistro() + " - " + professor.getNome() + " " + professor.getSobrenome() + ". Salário de R$ " + professor.getSalario());
            total += professor.salario;
        }
        System.out.println("Pagar o valor total de R$ " + total + " em salários aos professores.");
    }


}
