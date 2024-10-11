class Motor {
    private int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public String detalhesMotor() {
        return "Potência do motor: " + potencia + " HP";
    }
}

class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private Motor motor;

    public Carro(String marca, String modelo, int ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    public String detalhes() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", " + motor.detalhesMotor();
    }

    public static void main(String[] args) {
        Motor motor1 = new Motor(150);

        Carro carro1 = new Carro("Toyota", "Corolla", 2020, motor1);
        Carro carro2 = new Carro("Honda", "Civic", 2018, new Motor(140));
        Carro carro3 = new Carro("Ford", "Mustang", 2022, new Motor(450));

        System.out.println(carro1.detalhes());
        System.out.println(carro2.detalhes());
        System.out.println(carro3.detalhes());
    }
}
