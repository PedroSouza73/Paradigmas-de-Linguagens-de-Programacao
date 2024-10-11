public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String detalhes() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Velocidade: " + velocidade + " km/h";
    }

    public void acelerar(int incremento) {
        this.velocidade += incremento;
        System.out.println("O carro acelerou para " + this.velocidade + " km/h");
    }

    public void frear(int decremento) {
        this.velocidade -= decremento;
        if (this.velocidade < 0) {
            this.velocidade = 0;
        }
        System.out.println("O carro desacelerou para " + this.velocidade + " km/h");
    }

    public String exibirVelocidade() {
        return "Velocidade atual: " + this.velocidade + " km/h";
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2018);
        Carro carro3 = new Carro("Ford", "Mustang", 2022);

        carro1.acelerar(30);
        carro1.frear(10);
        System.out.println(carro1.exibirVelocidade());

        carro2.acelerar(50);
        carro2.frear(20);
        System.out.println(carro2.exibirVelocidade());

        carro3.acelerar(70);
        carro3.frear(50);
        System.out.println(carro3.exibirVelocidade());

        System.out.println(carro1.detalhes());
        System.out.println(carro2.detalhes());
        System.out.println(carro3.detalhes());
    }
}
