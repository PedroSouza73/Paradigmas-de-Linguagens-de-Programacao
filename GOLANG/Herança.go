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

func main() {
    var animais []Animal
    animais = append(animais, Cachorro{})
    animais = append(animais, Gato{})

    for _, animal := range animais {
        fmt.Println(animal.Som())
    }
}
