package main

import "fmt"

type Empregado struct {
    Nome    string
    Cargo   string
    Salario float64
}

func (e Empregado) Detalhes() string {
    return fmt.Sprintf("Nome: %s, Cargo: %s, Salário: R$%.2f", e.Nome, e.Cargo, e.Salario)
}

type Empresa struct {
    Nome      string
    Empregados []Empregado
}

func (e *Empresa) AdicionarEmpregado(empregado Empregado) {
    e.Empregados = append(e.Empregados, empregado)
}

func (e Empresa) ListarEmpregados() {
    for _, empregado := range e.Empregados {
        fmt.Println(empregado.Detalhes())
    }
}

func main() {
    empregado1 := Empregado{"Pedro Souza", "Desenvolvedor", 5000.00}
    empregado2 := Empregado{"Maria Souza", "Analista", 4500.00}
    empregado3 := Empregado{"Carlos Pereira", "Gerente", 6000.00}

    empresa := Empresa{Nome: "Tech Solutions"}
    empresa.AdicionarEmpregado(empregado1)
    empresa.AdicionarEmpregado(empregado2)
    empresa.AdicionarEmpregado(empregado3)

    fmt.Println("Empregados da empresa", empresa.Nome)
    empresa.ListarEmpregados()
}
