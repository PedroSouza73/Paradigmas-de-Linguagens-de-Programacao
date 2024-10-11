interface Imprimivel {
    String imprimir();
}

class Relatorio implements Imprimivel {
    private String conteudo;

    public Relatorio(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String imprimir() {
        return "Imprimindo relatório: " + conteudo;
    }
}

class Contrato implements Imprimivel {
    private String partes;

    public Contrato(String partes) {
        this.partes = partes;
    }

    @Override
    public String imprimir() {
        return "Imprimindo contrato entre: " + partes;
    }
}

public class Main {
    public static void main(String[] args) {
        Imprimivel relatorio = new Relatorio("Dados financeiros do Q1");
        Imprimivel contrato = new Contrato("Empresa A e Empresa B");

        System.out.println(relatorio.imprimir());
        System.out.println(contrato.imprimir());
    }
}
