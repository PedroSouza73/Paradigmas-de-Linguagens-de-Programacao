import java.util.ArrayList;
import java.util.List;

class Professor {
    private String nome;
    private List<Escola> escolas;

    public Professor(String nome) {
        this.nome = nome;
        this.escolas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Escola> getEscolas() {
        return escolas;
    }

    public void adicionarEscola(Escola escola) {
        if (!escolas.contains(escola)) {
            escolas.add(escola);
            escola.adicionarProfessor(this);
        }
    }
}

class Escola {
    private String nome;
    private List<Professor> professores;

    public Escola(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void adicionarProfessor(Professor professor) {
        if (!professores.contains(professor)) {
            professores.add(professor);
            professor.adicionarEscola(this);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Pedro Souza");
        Professor professor2 = new Professor("Maria Souza");

        Escola escola1 = new Escola("Escola A");
        Escola escola2 = new Escola("Escola B");

        professor1.adicionarEscola(escola1);
        professor1.adicionarEscola(escola2);
        professor2.adicionarEscola(escola2);

        System.out.println("Professores na " + escola1.getNome() + ":");
        for (Professor professor : escola1.getProfessores()) {
            System.out.println(professor.getNome());
        }

        System.out.println("\nProfessores na " + escola2.getNome() + ":");
        for (Professor professor : escola2.getProfessores()) {
            System.out.println(professor.getNome());
        }

        System.out.println("\nEscolas em que " + professor1.getNome() + " leciona:");
        for (Escola escola : professor1.getEscolas()) {
            System.out.println(escola.getNome());
        }

        System.out.println("\nEscolas em que " + professor2.getNome() + " leciona:");
        for (Escola escola : professor2.getEscolas()) {
            System.out.println(escola.getNome());
        }
    }
}
