package main

import "fmt"

type Imprimivel interface {
    Imprimir() string
}

type Relatorio struct {
    Conteudo string
}

func (r Relatorio) Imprimir() string {
    return fmt.Sprintf("Imprimindo relatório: %s", r.Conteudo)
}

type Contrato struct {
    Partes []string
}

func (c Contrato) Imprimir() string {
    return fmt.Sprintf("Imprimindo contrato entre: %s", c.Partes)
}

func imprimirDocumentos(documentos []Imprimivel) {
    for _, doc := range documentos {
        fmt.Println(doc.Imprimir())
    }
}

func main() {
    relatorio := Relatorio{Conteudo: "Dados financeiros do Q1"}
    contrato := Contrato{Partes: []string{"Empresa A", "Empresa B"}}

    documentos := []Imprimivel{relatorio, contrato}

    imprimirDocumentos(documentos)
}
