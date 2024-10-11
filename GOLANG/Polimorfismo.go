package main

import "fmt"

type Animal interface {
    Som() string
}

type Cachorro struct{}

func (c Cachorro) Som() string {
    return "Au Au!"
}

type Gato struct{}

func (g Gato) Som() string {
    return "Miau!"
}

func emitirSons(animais []Animal) {
    for _, animal := range animais {
        fmt.Println(animal.Som())
    }
}

func main() {
    animais := []Animal{Cachorro{}, Gato{}, Cachorro{}}

    emitirSons(animais)
}
