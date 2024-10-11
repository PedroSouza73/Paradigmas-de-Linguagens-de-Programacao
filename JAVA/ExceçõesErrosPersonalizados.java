class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class ContaBancaria {
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

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque inválido.");
        }
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException(String.format("Saldo insuficiente para sacar R$%.2f. Saldo atual: R$%.2f", valor, this.saldo));
        }
        this.saldo -= valor;
        System.out.printf("Sacado: R$%.2f. Saldo atual: R$%.2f%n", valor, this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Pedro Souza", 1000.00);

        try {
            conta1.depositar(500.00);
            conta1.sacar(2000.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            conta1.sacar(200.00);
            System.out.printf("Saldo atual: R$%.2f%n", conta1.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
