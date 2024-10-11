package main

import "fmt"

type Motor struct {
    Potencia int
}

func (m Motor) DetalhesMotor() string {
    return fmt.Sprintf("Potência do motor: %d HP", m.Potencia)
}

type Carro struct {
    Marca  string
    Modelo string
    Ano    int
    Motor  Motor
}

func (c Carro) Detalhes() string {
    return fmt.Sprintf("Marca: %s, Modelo: %s, Ano: %d, %s", c.Marca, c.Modelo, c.Ano, c.Motor.DetalhesMotor())
}

func main() {
    motor1 := Motor{Potencia: 150}
    
    carro1 := Carro{"Toyota", "Corolla", 2020, motor1}
    carro2 := Carro{"Honda", "Civic", 2018, Motor{Potencia: 140}}
    carro3 := Carro{"Ford", "Mustang", 2022, Motor{Potencia: 450}}

    fmt.Println(carro1.Detalhes())
    fmt.Println(carro2.Detalhes())
    fmt.Println(carro3.Detalhes())
}
