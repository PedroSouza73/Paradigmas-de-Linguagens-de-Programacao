package main

import "fmt"

type Professor struct {
    Nome    string
    Escolas []*Escola
}

func (p *Professor) AdicionarEscola(e *Escola) {
    p.Escolas = append(p.Escolas, e)
}

func (p Professor) ListarEscolas() {
    for _, escola := range p.Escolas {
        fmt.Println(escola.Nome)
    }
}

type Escola struct {
    Nome       string
    Professores []*Professor
}

func (e *Escola) AdicionarProfessor(p *Professor) {
    e.Professores = append(e.Professores, p)
}

func (e Escola) ListarProfessores() {
    for _, professor := range e.Professores {
        fmt.Println(professor.Nome)
    }
}

func main() {
    professor1 := &Professor{Nome: "Pedro Souza"}
    professor2 := &Professor{Nome: "Maria Souza"}

    escola1 := &Escola{Nome: "Escola A"}
    escola2 := &Escola{Nome: "Escola B"}

    professor1.AdicionarEscola(escola1)
    professor1.AdicionarEscola(escola2)
    professor2.AdicionarEscola(escola2)

    escola1.AdicionarProfessor(professor1)
    escola2.AdicionarProfessor(professor1)
    escola2.AdicionarProfessor(professor2)

    fmt.Println("Professores na", escola1.Nome)
    escola1.ListarProfessores()
    
    fmt.Println("\nProfessores na", escola2.Nome)
    escola2.ListarProfessores()

    fmt.Println("\nEscolas em que", professor1.Nome, "leciona")
    professor1.ListarEscolas()

    fmt.Println("\nEscolas em que", professor2.Nome, "leciona")
    professor2.ListarEscolas()
}
