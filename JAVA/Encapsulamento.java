public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Depositado: R$%.2f. Saldo atual: R$%.2f%n", valor, this.saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.printf("Sacado: R$%.2f. Saldo atual: R$%.2f%n", valor, this.saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Pedro Souza", 1000.00);

        conta.depositar(500.00);
        conta.sacar(200.00);
        conta.sacar(2000.00);

        System.out.printf("Saldo atual: R$%.2f%n", conta.getSaldo());
    }
}
