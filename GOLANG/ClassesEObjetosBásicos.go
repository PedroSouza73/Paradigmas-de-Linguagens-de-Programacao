package main

import "fmt"

type Carro struct {
    Marca  string
    Modelo string
    Ano    int
}

func (c Carro) Detalhes() string {
    return fmt.Sprintf("Marca: %s, Modelo: %s, Ano: %d", c.Marca, c.Modelo, c.Ano)
}

func main() {
    carro1 := Carro{"Toyota", "Corolla", 2020}
    carro2 := Carro{"Honda", "Civic", 2018}
    carro3 := Carro{"Ford", "Mustang", 2022}

    fmt.Println(carro1.Detalhes())
    fmt.Println(carro2.Detalhes())
    fmt.Println(carro3.Detalhes())
}
