abstract class Funcionario {
    public abstract double calcularSalario();
}

class FuncionarioHorista extends Funcionario {
    private String nome;
    private int horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioHorista(String nome, int horasTrabalhadas, double valorPorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }

    public String getNome() {
        return nome;
    }
}

class FuncionarioAssalariado extends Funcionario {
    private String nome;
    private double salarioMensal;

    public FuncionarioAssalariado(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }

    public String getNome() {
        return nome;
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario horista = new FuncionarioHorista("Pedro Souza", 160, 25.0);
        Funcionario assalariado = new FuncionarioAssalariado("Maria Souza", 5000.0);

        System.out.printf("%s: Salário = R$%.2f%n", ((FuncionarioHorista) horista).getNome(), horista.calcularSalario());
        System.out.printf("%s: Salário = R$%.2f%n", ((FuncionarioAssalariado) assalariado).getNome(), assalariado.calcularSalario());
    }
}
