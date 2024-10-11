package main

import "fmt"

type Matematica struct{}

func (m Matematica) Fatorial(n int) int {
    if n == 0 || n == 1 {
        return 1
    }
    return n * m.Fatorial(n-1)
}

func main() {
    mat := Matematica{}

    fmt.Printf("Fatorial de 5 é: %d\n", mat.Fatorial(5))
    fmt.Printf("Fatorial de 7 é: %d\n", mat.Fatorial(7))
}
