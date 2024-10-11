from abc import ABC, abstractmethod

class Imprimivel(ABC):
    @abstractmethod
    def imprimir(self):
        pass

class Relatorio(Imprimivel):
    def __init__(self, conteudo):
        self.conteudo = conteudo

    def imprimir(self):
        return f'Imprimindo relatório: {self.conteudo}'

class Contrato(Imprimivel):
    def __init__(self, partes):
        self.partes = partes

    def imprimir(self):
        return f'Imprimindo contrato entre: {", ".join(self.partes)}'

relatorio = Relatorio('Dados financeiros do Q1')
contrato = Contrato(['Empresa A', 'Empresa B'])

print(relatorio.imprimir())
print(contrato.imprimir())
