package CheckpointPoo;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

//Criando disciplinas:

        Disciplina disciplina1 = new Disciplina("POO","Programação orientada a objetos","570 horas");
        Disciplina disciplina2 = new Disciplina("FE", "Front-end","420 horas");

//Criando turma:

        Turma turma1 = new Turma("A123", disciplina1, 36,2);

//Aplicação do método:

        turma1.pesquisarCodigo();
        turma1.pesquisarDisciplina();

//Criando turma:

        Turma turma2 = new Turma("A453", disciplina2, 32,2);

//Aplicação do método:

        turma2.pesquisarCodigo();
        turma2.pesquisarDisciplina();

//Criação da lista de alunos:

        List<Aluno> alunos = new ArrayList<>();

//Criando novos aluno:

        Aluno aluno1 = new Aluno("Maria", "Oliveira", 345455454, 996522587,"Av.Brasil, 123", "M945",10, turma1);
        Aluno aluno2 = new Aluno("Bruno","Silva", 284789545,998754125, "Rua Cica, 87", "M540",5, turma1);
        Aluno aluno3 = new Aluno("Cintia","Souza", 365745951, 965452158, "Av.Jabaquara, 981", "M154", 4, turma2);
        Aluno aluno4 = new Aluno("Daniel", "Brito",452128657,995124785,"Av.Domingos de Morais, 1543","M220", 10,turma2);

//Adicionando aluno a lista de alunos:

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);

//Criando professor:

        Professor professor = new Professor("Celso","Pinheiro",22456554,990454545,"Av.Paulista, 1542", 5487,
                "Docente 1",9540,"Mestre");

//Aplicação do método:

        professor.avaliar(alunos);

//Criando diretoria:

        Diretoria diretoria1 = new Diretoria("Alice","Alves",254256875,995478121,"Av.Brasil, 548", 12050);
        diretoria1.administrarFinanceiro();

//Criando administrador:

        Administrador administrador1 = new Administrador("Carlos","Pereira", 254874851,998784522,"Rua Holanda, 48",
                328,"Administrativo II", 3580);

//Aplicação do método:
        administrador1.auxiliarFinanceiro();
        administrador1.administrar();
        administrador1.cadastrar();

    }
}
