package main

import "fmt"

type Carro struct {
    Marca     string
    Modelo    string
    Ano       int
    Velocidade int
}

func (c Carro) Detalhes() string {
    return fmt.Sprintf("Marca: %s, Modelo: %s, Ano: %d, Velocidade: %d km/h", c.Marca, c.Modelo, c.Ano, c.Velocidade)
}

func (c *Carro) Acelerar(incremento int) {
    c.Velocidade += incremento
    fmt.Printf("O carro acelerou para %d km/h\n", c.Velocidade)
}

func (c *Carro) Frear(decremento int) {
    c.Velocidade -= decremento
    if c.Velocidade < 0 {
        c.Velocidade = 0
    }
    fmt.Printf("O carro desacelerou para %d km/h\n", c.Velocidade)
}

func (c Carro) ExibirVelocidade() string {
    return fmt.Sprintf("Velocidade atual: %d km/h", c.Velocidade)
}

func main() {
    carro1 := Carro{"Toyota", "Corolla", 2020, 0}
    carro2 := Carro{"Honda", "Civic", 2018, 0}
    carro3 := Carro{"Ford", "Mustang", 2022, 0}

    carro1.Acelerar(30)
    carro1.Frear(10)
    fmt.Println(carro1.ExibirVelocidade())

    carro2.Acelerar(50)
    carro2.Frear(20)
    fmt.Println(carro2.ExibirVelocidade())

    carro3.Acelerar(70)
    carro3.Frear(50)
    fmt.Println(carro3.ExibirVelocidade())

    fmt.Println(carro1.Detalhes())
    fmt.Println(carro2.Detalhes())
    fmt.Println(carro3.Detalhes())
}
