# Interface para a estratégia de fabricação de carros
class CarManufacturingStrategy:
    def manufacture(self):
        pass


# Implementações específicas de estratégias
class ElectricCarManufacturingStrategy(CarManufacturingStrategy):
    def manufacture(self):
        print("Fabricando um carro elétrico...")

class GasolineCarManufacturingStrategy(CarManufacturingStrategy):
    def manufacture(self):
        print("Fabricando um carro a gasolina...")


# Contexto da fábrica de carros
class CarFactory:
    def __init__(self, strategy):
        self.strategy = strategy

    def set_strategy(self, strategy):
        self.strategy = strategy

    def produce_car(self):
        self.strategy.manufacture()


# Exemplo de uso
if __name__ == "__main__":
    # Criação das estratégias de fabricação de carros
    electric_strategy = ElectricCarManufacturingStrategy()
    gasoline_strategy = GasolineCarManufacturingStrategy()

    # Criação da fábrica de carros com uma estratégia padrão
    factory = CarFactory(electric_strategy)

    # Produção de um carro usando a estratégia atual
    factory.produce_car()

    # Mudança da estratégia de fabricação em tempo de execução
    factory.set_strategy(gasoline_strategy)

    # Produção de outro carro usando a nova estratégia
    factory.produce_car()
