class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public Produto somar(Produto outro) {
        String novoNome = this.nome + " & " + outro.nome;
        double novoPreco = this.preco + outro.preco;
        return new Produto(novoNome, novoPreco);
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$" + preco;
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 2500.00);
        Produto produto2 = new Produto("Mouse", 150.00);

        Produto produtoResultado = produto1.somar(produto2);
        System.out.println(produtoResultado);
    }
}
