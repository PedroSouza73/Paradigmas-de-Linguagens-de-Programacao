package main

import (
    "fmt"
    "errors"
)

type ContaBancaria struct {
    titular string
    saldo   float64
}

func NovaConta(titular string, saldoInicial float64) *ContaBancaria {
    return &ContaBancaria{titular, saldoInicial}
}

func (c *ContaBancaria) Depositar(valor float64) {
    if valor > 0 {
        c.saldo += valor
        fmt.Printf("Depositado: R$%.2f. Saldo atual: R$%.2f\n", valor, c.saldo)
    } else {
        fmt.Println("Valor de depósito inválido.")
    }
}

func (c *ContaBancaria) Sacar(valor float64) error {
    if valor <= 0 {
        return errors.New("valor de saque inválido")
    }
    if valor > c.saldo {
        return errors.New("saldo insuficiente")
    }
    c.saldo -= valor
    fmt.Printf("Sacado: R$%.2f. Saldo atual: R$%.2f\n", valor, c.saldo)
    return nil
}

func (c *ContaBancaria) ExibirSaldo() float64 {
    return c.saldo
}

func main() {
    conta := NovaConta("Pedro Souza", 1000.00)

    conta.Depositar(500.00)
    if err := conta.Sacar(200.00); err != nil {
        fmt.Println("Erro:", err)
    }
    if err := conta.Sacar(2000.00); err != nil {
        fmt.Println("Erro:", err)
    }

    fmt.Printf("Saldo atual: R$%.2f\n", conta.ExibirSaldo())
}
