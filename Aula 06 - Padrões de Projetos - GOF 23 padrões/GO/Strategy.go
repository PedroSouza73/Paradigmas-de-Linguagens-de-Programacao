package main

import "fmt"

// Interface para a estratégia de fabricação de carros
type CarManufacturingStrategy interface {
    Manufacture()
}

// Implementações específicas de estratégias
type ElectricCarManufacturingStrategy struct{}

func (e *ElectricCarManufacturingStrategy) Manufacture() {
    fmt.Println("Fabricando um carro elétrico...")
}

type GasolineCarManufacturingStrategy struct{}

func (g *GasolineCarManufacturingStrategy) Manufacture() {
    fmt.Println("Fabricando um carro a gasolina...")
}

// Contexto da fábrica de carros
type CarFactory struct {
    strategy CarManufacturingStrategy
}

func (f *CarFactory) SetStrategy(strategy CarManufacturingStrategy) {
    f.strategy = strategy
}

func (f *CarFactory) ProduceCar() {
    f.strategy.Manufacture()
}

func main() {
    // Criação das estratégias de fabricação de carros
    electricStrategy := &ElectricCarManufacturingStrategy{}
    gasolineStrategy := &GasolineCarManufacturingStrategy{}

    // Criação da fábrica de carros com uma estratégia padrão
    factory := &CarFactory{strategy: electricStrategy}

    // Produção de um carro usando a estratégia atual
    factory.ProduceCar()

    // Mudança da estratégia de fabricação em tempo de execução
    factory.SetStrategy(gasolineStrategy)

    // Produção de outro carro usando a nova estratégia
    factory.ProduceCar()
}
