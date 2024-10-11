from abc import ABC, abstractmethod

class Funcionario(ABC):
    @abstractmethod
    def calcular_salario(self):
        pass

class FuncionarioHorista(Funcionario):
    def __init__(self, nome, horas_trabalhadas, valor_por_hora):
        self.nome = nome
        self.horas_trabalhadas = horas_trabalhadas
        self.valor_por_hora = valor_por_hora

    def calcular_salario(self):
        return self.horas_trabalhadas * self.valor_por_hora

class FuncionarioAssalariado(Funcionario):
    def __init__(self, nome, salario_mensal):
        self.nome = nome
        self.salario_mensal = salario_mensal

    def calcular_salario(self):
        return self.salario_mensal


horista = FuncionarioHorista('Pedro Souza', 160, 25) 
assalariado = FuncionarioAssalariado('Maria Souza', 5000) 

print(f'{horista.nome}: Salário = R${horista.calcular_salario()}')
print(f'{assalariado.nome}: Salário = R${assalariado.calcular_salario()}')
