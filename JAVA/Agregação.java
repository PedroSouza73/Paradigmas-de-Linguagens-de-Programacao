import java.util.ArrayList;
import java.util.List;

class Empregado {
    private String nome;
    private String cargo;
    private double salario;

    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public String detalhes() {
        return "Nome: " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario;
    }
}

class Empresa {
    private String nome;
    private List<Empregado> empregados;

    public Empresa(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void listarEmpregados() {
        for (Empregado empregado : empregados) {
            System.out.println(empregado.detalhes());
        }
    }

    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Pedro Souza", "Desenvolvedor", 5000.00);
        Empregado empregado2 = new Empregado("Maria Souza", "Analista", 4500.00);
        Empregado empregado3 = new Empregado("Carlos Pereira", "Gerente", 6000.00);

        Empresa empresa = new Empresa("Tech Solutions");
        empresa.adicionarEmpregado(empregado1);
        empresa.adicionarEmpregado(empregado2);
        empresa.adicionarEmpregado(empregado3);

        System.out.println("Empregados da empresa " + empresa.nome + ":");
        empresa.listarEmpregados();
    }
}
