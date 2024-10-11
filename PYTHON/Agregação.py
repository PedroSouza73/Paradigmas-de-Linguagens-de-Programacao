class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

    def detalhes(self):
        return f'Nome: {self.nome}, Cargo: {self.cargo}, Salário: R${self.salario}'

class Empresa:
    def __init__(self, nome):
        self.nome = nome
        self.empregados = []

    def adicionar_empregado(self, empregado):
        self.empregados.append(empregado)
    
    def listar_empregados(self):
        for empregado in self.empregados:
            print(empregado.detalhes())


empregado1 = Empregado('Pedro Souza', 'Desenvolvedor', 5000)
empregado2 = Empregado('Maria Souza', 'Analista', 4500)
empregado3 = Empregado('Carlos Pereira', 'Gerente', 6000)

empresa = Empresa('Tech Solutions')
empresa.adicionar_empregado(empregado1)
empresa.adicionar_empregado(empregado2)
empresa.adicionar_empregado(empregado3)

empresa.listar_empregados()
