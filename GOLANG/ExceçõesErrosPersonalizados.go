package main

import (
    "fmt"
    "errors"
)

type SaldoInsuficiente struct {
    mensagem string
}

func (e *SaldoInsuficiente) Error() string {
    return e.mensagem
}

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
        return &SaldoInsuficiente{mensagem: fmt.Sprintf("Saldo insuficiente para sacar R$%.2f. Saldo atual: R$%.2f", valor, c.saldo)}
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

    err := conta.Sacar(2000.00)
    if err != nil {
        fmt.Println("Erro:", err)
    } else {
        fmt.Printf("Saldo atual: R$%.2f\n", conta.ExibirSaldo())
    }

    err = conta.Sacar(200.00)
    if err != nil {
        fmt.Println("Erro:", err)
    } else {
        fmt.Printf("Saldo atual: R$%.2f\n", conta.ExibirSaldo())
    }
}
