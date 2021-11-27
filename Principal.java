package CheckpointPoo;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

//Diretoria e método:

        Diretoria diretoria1 = new Diretoria("Alice", "Alves", 254256875, 995478121, "Av.Brasil, 548", 12050);
        diretoria1.administrarFinanceiro();
        System.out.println();

//Disciplina:

        Disciplina disciplina1 = new Disciplina("POO", "Programação orientada a objetos", "570 horas");
        Disciplina disciplina2 = new Disciplina("FE", "Front-end", "420 horas");

//Turma e método:

        Turma turma1 = new Turma("A1", disciplina1, 36, 2);

        turma1.pesquisarCodigo();
        turma1.pesquisarDisciplina();

        System.out.println();

//Turma e método:

        Turma turma2 = new Turma("A4", disciplina2, 32, 2);

        turma2.pesquisarCodigo();
        turma2.pesquisarDisciplina();

        System.out.println();

//Aluno e lista alunos:

        Aluno aluno1 = new Aluno("Maria", "Oliveira", 345455454, 996522587, "Av.Brasil, 123", "M945", 10, turma1);
        Aluno aluno2 = new Aluno("Bruno", "Silva", 284789545, 998754125, "Rua Cica, 87", "M540", 6, turma1);
        Aluno aluno3 = new Aluno("Cintia", "Souza", 365745951, 965452158, "Av.Jabaquara, 981", "M154", 5, turma2);
        Aluno aluno4 = new Aluno("Daniel", "Brito", 452128657, 995124785, "Av.Domingos de Morais, 1543", "M220", 10, turma2);

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);

        System.out.println();
//Professor e método:

        Professor professor1 = new Professor("Celso", "Pinheiro", 22456554, 990454545, "Av.Paulista, 1542", 54,
                "Docente 1", 9540, "Mestre");
        Professor professor2 = new Professor("Michele", "Silva", 457815487,998721452,"Av.Fagundes Filho, 65", 54,
                "Docente 3", 11570,"Mestre" );
        Professor professor3 = new Professor("Renata", "Almeida", 154785654, 998745214, "Av. J.J. Rodrigues, 4587",35,
                "Docente 2",8579, "Mestre");

        professor1.avaliar(alunos);

//lista professores

        List<Professor> professores = new ArrayList<>();
        professores.add(professor1);
        professores.add(professor2);
        professores.add(professor3);

        System.out.println();

//Administrador e método:

        Administrador administrador1 = new Administrador("Carlos", "Pereira", 254874851, 998784522, "Rua Holanda, 48",
                328, "Administrativo II", 3580);

        administrador1.pagarProfessor(professores);
    }
}