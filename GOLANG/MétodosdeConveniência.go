package main

import "fmt"

type Produto struct {
    Nome  string
    Preco float64
}

func (p Produto) Somar(outro Produto) Produto {
    return Produto{
        Nome:  p.Nome + " & " + outro.Nome,
        Preco: p.Preco + outro.Preco,
    }
}

func main() {
    produto1 := Produto{"Notebook", 2500.00}
    produto2 := Produto{"Mouse", 150.00}

    produtoResultado := produto1.Somar(produto2)
    fmt.Printf("Produto resultante: %s, Preço total: R$%.2f\n", produtoResultado.Nome, produtoResultado.Preco)
}
