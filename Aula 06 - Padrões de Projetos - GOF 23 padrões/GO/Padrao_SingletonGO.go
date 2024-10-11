package main

import (
    "fmt"
    "sync"
)

type Singleton struct{}

var instance *Singleton
var once sync.Once

// Função que retorna a instância Singleton
func GetInstance() *Singleton {
    once.Do(func() {
        instance = &Singleton{}
        fmt.Println("Nova instância criada.")
    })
    return instance
}

// Exemplo de uso
func main() {
    s1 := GetInstance()
    s2 := GetInstance()

    fmt.Println(s1 == s2) // True, ambas as instâncias são a mesma
}
