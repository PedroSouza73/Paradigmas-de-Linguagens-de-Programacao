package main

import "fmt"

type Funcionario interface {
    CalcularSalario() float64
}

type FuncionarioHorista struct {
    Nome           string
    HorasTrabalhadas int
    ValorPorHora   float64
}

func (fh FuncionarioHorista) CalcularSalario() float64 {
    return float64(fh.HorasTrabalhadas) * fh.ValorPorHora
}

type FuncionarioAssalariado struct {
    Nome          string
    SalarioMensal float64
}

func (fa FuncionarioAssalariado) CalcularSalario() float64 {
    return fa.SalarioMensal
}

func main() {
    horista := FuncionarioHorista{"Pedro Souza", 160, 25.0}
    assalariado := FuncionarioAssalariado{"Maria Souza", 5000.0}

    fmt.Printf("%s: Salário = R$%.2f\n", horista.Nome, horista.CalcularSalario())
    fmt.Printf("%s: Salário = R$%.2f\n", assalariado.Nome, assalariado.CalcularSalario())
}
