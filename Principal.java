package CheckpointPoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


//Scanner para cadastrar a Diretoria:

        Scanner diretor = new Scanner(System.in);

        System.out.println("Digite o nome do diretor(a): ");
        String nomeDire = diretor.nextLine();

        System.out.println("Digite o sobrenome: ");
        String sobrenomeDire = diretor.nextLine();

        System.out.println("Digite o cpf:");
        String cpfDire = diretor.nextLine();

        System.out.println("Digite o telefone celular: ");
        String celularDire = diretor.nextLine();

        System.out.println("Digite o endereço: ");
        String enderecoDire = diretor.nextLine();

        System.out.println("Digite o valor do salário: ");
        double salarioDire = diretor.nextDouble();


        Diretoria diretoria = new Diretoria(nomeDire, sobrenomeDire, cpfDire, celularDire, enderecoDire, salarioDire);
        System.out.println("Nome: " + diretoria.getNome() + ".\n" + "Sobrenome: " + diretoria.getSobrenome() + ".\n" +
                "Número CPF: " + diretoria.getCpf() + ".\n" + "Telefone celular: " + diretoria.getNumeroCelular() + ".\n" +
                "Endereço: " + diretoria.getEndereco() + ".\n" + "Valor do salário R$: " + diretoria.getSalario());
        System.out.println();
        diretoria.administrarFinanceiro();

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();

//Scanner para criar uma disciplina:

        Scanner disciplina1 = new Scanner(System.in);

        System.out.println("Cadastro de disciplina");

        System.out.println("Digite o nome da disciplina: ");
        String nomeDisci = disciplina1.nextLine();

        System.out.println("Digite uma breve descrição da disciplina: ");
        String descricaoDisci = disciplina1.nextLine();

        System.out.println("Digite a quantidade total de aulas (em números): ");
        int quantidadeAula = disciplina1.nextInt();

        Disciplina disciplina = new Disciplina(nomeDisci, descricaoDisci, quantidadeAula);
        System.out.println("Nome da disciplina: " + disciplina.getNomeDisciplina() + ".\n" + "Descrição: " + disciplina.getDescricao() + ".\n" + "Quantidade total de aulas: " +
                disciplina.getQuantTotalAulas());

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();

//Class Turma:

        System.out.println("Método pesquisar código da turma.");
        Turma turma1 = new Turma("A1", disciplina1, 36, 2);

        //Método pesquisar código da turma
        turma1.pesquisarCodigo();

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();

//Class Aluno:

        Aluno aluno1 = new Aluno("Maria", "Oliveira", "345.455.454-54", "(11)99652-2587", "Av.Brasil, 123", "M945", 10, turma1);
        Aluno aluno2 = new Aluno("Bruno", "Silva", "284.789.545-87", "(11)99875-4125", "Rua Cica, 87", "M540", 6, turma1);
        Aluno aluno3 = new Aluno("Cintia", "Souza", "365.745.951-81", "(11)96545-2158", "Av.Jabaquara, 981", "M154", 5, turma1);
        Aluno aluno4 = new Aluno("Daniel", "Brito", "452.451.286-57", "(11)99512-4785", "Av.Domingos de Morais, 1543", "M220", 10, turma1);


        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);

        System.out.println("-----------------------------------------------------------------------------------");

//Class Professor:
        System.out.println("Métodos da class Professor");
        System.out.println("Lista de alunos");
        System.out.println();

        Professor professor1 = new Professor("Celso", "Pinheiro", "224.565.547-75", "(11)99045-4545", "Av.Paulista, 1542", 54,
                "Docente 1", 9540, "Mestre");
        Professor professor2 = new Professor("Michele", "Silva", "457.815.487-54", "(11)99872-1452", "Av.Fagundes Filho, 65", 68,
                "Docente 3", 11570, "Mestre");
        Professor professor3 = new Professor("Renata", "Almeida", "154.785.654-11", "(11)99874-5214", "Av. J.J. Rodrigues, 4587", 35,
                "Docente 2", 8579, "Mestre");

        System.out.println();
        professor1.avaliarAluno(alunos);
        System.out.println();

        //Método para verificar a entrega de relatórios
        professor1.entregarRelatorio(2);
        System.out.println();

        //Método para verificar a batida de ponto.
        professor1.baterPonto(2);

        //lista de professores


        List<Professor> professores = new ArrayList<>();
        professores.add(professor1);
        professores.add(professor2);
        professores.add(professor3);

        System.out.println("-----------------------------------------------------------------------------------");
//Class Administrador:
        System.out.println("Métodos da class Administrador");
        System.out.println("Lista de professores");

        Administrador administrador1 = new Administrador("Carlos", "Pereira", "254.874.851-82", "(11)99878-4522", "Rua Holanda, 48",
                328, "Administrativo II", 3580);

        System.out.println();
        System.out.println();
        //Método pagarProfessores:
        administrador1.pagarProfessor(professores);
        System.out.println();

        //Método para verificar a batida de ponto.
        administrador1.baterPonto(9);
        System.out.println();

        //Método para verificar a entrega de relatórios
        administrador1.entregarRelatorio(3);

   }
}