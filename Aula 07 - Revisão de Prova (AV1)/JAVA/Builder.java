public // Classe de produto que queremos construir
class Carro {
    private String modelo;
    private String cor;
    private int ano;
    
    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    
    // Getters e setters
    
}

// Interface do Builder
interface CarroBuilder {
    CarroBuilder setModelo(String modelo);
    CarroBuilder setCor(String cor);
    CarroBuilder setAno(int ano);
    Carro build();
}

// Implementação do Builder
class CarroBuilderImpl implements CarroBuilder {
    private String modelo;
    private String cor;
    private int ano;
    
    @Override
    public CarroBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }
    
    @Override
    public CarroBuilder setCor(String cor) {
        this.cor = cor;
        return this;
    }
    
    @Override
    public CarroBuilder setAno(int ano) {
        this.ano = ano;
        return this;
    }
    
    @Override
    public Carro build() {
        return new Carro(modelo, cor, ano);
    }
}

// Exemplo de uso do Builder
public class Main {
    public static void main(String[] args) {
        CarroBuilder builder = new CarroBuilderImpl();
        
        Carro carro = builder
            .setModelo("Fiat")
            .setCor("Azul")
            .setAno(2020)
            .build();
        
        System.out.println(carro);
    }
}
 Main {
    
}
