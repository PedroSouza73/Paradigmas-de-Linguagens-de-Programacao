package main

import (
    "fmt"
    "sync"
)

// Estrutura Singleton
type Singleton struct{}

var instance *Singleton
var once sync.Once

// Função para obter a instância Singleton
func GetInstance() *Singleton {
    once.Do(func() {
        fmt.Println("Criando a nova instância Singleton.")
        instance = &Singleton{}
    })
    return instance
}

// Exemplo de uso
func main() {
    s1 := GetInstance()
    s2 := GetInstance()

    fmt.Println(s1 == s2)  // True, pois ambas as instâncias são iguais
}
