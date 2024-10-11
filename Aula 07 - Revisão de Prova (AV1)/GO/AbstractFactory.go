package main

import "fmt"

// Interface Abstract Factory
type CarFactory interface {
    CreateSedan() Sedan
    CreateSUV() SUV
}

// Implementação da fábrica para Carros Toyota
type ToyotaFactory struct{}

func (t *ToyotaFactory) CreateSedan() Sedan {
    return &ToyotaSedan{}
}

func (t *ToyotaFactory) CreateSUV() SUV {
    return &ToyotaSUV{}
}

// Implementação da fábrica para Carros Ford
type FordFactory struct{}

func (f *FordFactory) CreateSedan() Sedan {
    return &FordSedan{}
}

func (f *FordFactory) CreateSUV() SUV {
    return &FordSUV{}
}

// Interface para os produtos
type Sedan interface {
    DisplayInfo()
}

type SUV interface {
    DisplayInfo()
}

// Implementações de produtos específicos para Toyota
type ToyotaSedan struct{}

func (s *ToyotaSedan) DisplayInfo() {
    fmt.Println("Toyota Corolla - Sedan")
}

type ToyotaSUV struct{}

func (s *ToyotaSUV) DisplayInfo() {
    fmt.Println("Toyota RAV4 - SUV")
}

// Implementações de produtos específicos para Ford
type FordSedan struct{}

func (s *FordSedan) DisplayInfo() {
    fmt.Println("Ford Fusion - Sedan")
}

type FordSUV struct{}

func (s *FordSUV) DisplayInfo() {
    fmt.Println("Ford Explorer - SUV")
}

// Função que utiliza a fábrica para criar carros
func produceCars(factory CarFactory) {
    sedan := factory.CreateSedan()
    suv := factory.CreateSUV()

    sedan.DisplayInfo()
    suv.DisplayInfo()
}

func main() {
    fmt.Println("Produzindo carros Toyota:")
    toyotaFactory := &ToyotaFactory{}
    produceCars(toyotaFactory)

    fmt.Println("\nProduzindo carros Ford:")
    fordFactory := &FordFactory{}
    produceCars(fordFactory)
}
