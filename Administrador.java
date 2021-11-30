package CheckpointPoo;

import java.util.List;
import java.util.Scanner;

//Class Administrador herdou atributos da class Funcionario

public class Administrador extends Funcionario{

    public Administrador(String nome, String sobrenome, String cpf, String numeroCelular, String endereco, int numeroRegistro, String cargo, double salario) {
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

//Métodos subescrito da class Funcionario

    @Override
    public void baterPonto(double horas) {
        double total = 8.00;
        if(horas < total) {
            System.out.println("Administrador(a), você ainda precisa trabalhar " + (horas - total) + " horas hoje.");
        } else {
            System.out.println("Administrador(a) seu turno foi completo, até amamhã.");
        }

    }

    @Override
    public void entregarRelatorio(int quantidade) {
        int total = 6;
        if (quantidade < total) {
            System.out.println("Administrador(a), faltam entregar " + (total - quantidade) + " relatórios");
        } else {
            System.out.println("Administrador(a), relatórios entregues.");
        }
    }
}