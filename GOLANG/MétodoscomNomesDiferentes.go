package main

import (
    "bufio"
    "fmt"
    "os"
    "strconv"
    "strings"
)

type Calculadora struct{}

func (c Calculadora) SomarDois(a, b int) int {
    return a + b
}

func (c Calculadora) SomarTres(a, b, d int) int {
    return a + b + d
}

func main() {
    calc := Calculadora{}

    reader := bufio.NewReader(os.Stdin)
    fmt.Println("Digite dois ou três números separados por espaço:")
    input, _ := reader.ReadString('\n')

    numeros := strings.Fields(input)
    valores := make([]int, len(numeros))
    for i, numero := range numeros {
        valor, err := strconv.Atoi(numero)
        if err != nil {
            fmt.Println("Entrada inválida:", numero)
            return
        }
        valores[i] = valor
    }

    var resultado int
    if len(valores) == 2 {
        resultado = calc.SomarDois(valores[0], valores[1])
        fmt.Printf("A soma de %d e %d é: %d\n", valores[0], valores[1], resultado)
    } else if len(valores) == 3 {
        resultado = calc.SomarTres(valores[0], valores[1], valores[2])
        fmt.Printf("A soma de %d, %d e %d é: %d\n", valores[0], valores[1], valores[2], resultado)
    } else {
        fmt.Println("Por favor, digite dois ou três números.")
    }
}
