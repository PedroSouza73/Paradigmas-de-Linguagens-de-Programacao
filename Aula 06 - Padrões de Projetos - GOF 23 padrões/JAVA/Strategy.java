// Interface para a estratégia de fabricação de carros
interface CarManufacturingStrategy {
    void manufacture();
}

// Implementações específicas de estratégias
class ElectricCarManufacturingStrategy implements CarManufacturingStrategy {
    @Override
    public void manufacture() {
        System.out.println("Fabricando um carro elétrico...");
    }
}

class GasolineCarManufacturingStrategy implements CarManufacturingStrategy {
    @Override
    public void manufacture() {
        System.out.println("Fabricando um carro a gasolina...");
    }
}

// Contexto da fábrica de carros
class CarFactory {
    private CarManufacturingStrategy strategy;

    public CarFactory(CarManufacturingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CarManufacturingStrategy strategy) {
        this.strategy = strategy;
    }

    public void produceCar() {
        strategy.manufacture();
    }
}

// Exemplo de uso
public class Strategy {
    public static void main(String[] args) {
        // Criação das estratégias de fabricação de carros
        CarManufacturingStrategy electricStrategy = new ElectricCarManufacturingStrategy();
        CarManufacturingStrategy gasolineStrategy = new GasolineCarManufacturingStrategy();

        // Criação da fábrica de carros com uma estratégia padrão
        CarFactory factory = new CarFactory(electricStrategy);

        // Produção de um carro usando a estratégia atual
        factory.produceCar();

        // Mudança da estratégia de fabricação em tempo de execução
        factory.setStrategy(gasolineStrategy);

        // Produção de outro carro usando a nova estratégia
        factory.produceCar();
    }
}
