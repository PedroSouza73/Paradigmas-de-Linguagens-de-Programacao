package main

import (
    "fmt"
    "sync"
)

type Configuracao struct {
    valor string
}

var instancia *Configuracao
var once sync.Once

func ObterConfiguracao(valor string) *Configuracao {
    once.Do(func() {
        instancia = &Configuracao{valor: valor}
    })
    return instancia
}

func main() {
    config1 := ObterConfiguracao("Configuração A")
    config2 := ObterConfiguracao("Configuração B")

    fmt.Println("Config1:", config1.valor)
    fmt.Println("Config2:", config2.valor)
    fmt.Println("Config1 e Config2 são a mesma instância:", config1 == config2)
}
