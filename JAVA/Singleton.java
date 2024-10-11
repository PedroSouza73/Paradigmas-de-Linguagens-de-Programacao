public class Configuracao {
    private static Configuracao instancia;
    private String valor;

    private Configuracao(String valor) {
        this.valor = valor;
    }

    public static synchronized Configuracao getInstancia(String valor) {
        if (instancia == null) {
            instancia = new Configuracao(valor);
        }
        return instancia;
    }

    public String getValor() {
        return valor;
    }

    public static void main(String[] args) {
        Configuracao config1 = Configuracao.getInstancia("Configuração A");
        Configuracao config2 = Configuracao.getInstancia("Configuração B");

        System.out.println("Config1: " + config1.getValor());
        System.out.println("Config2: " + config2.getValor());
        System.out.println("Config1 e Config2 são a mesma instância: " + (config1 == config2));
    }
}
