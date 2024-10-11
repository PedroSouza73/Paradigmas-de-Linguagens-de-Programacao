class Professor:
    def __init__(self, nome):
        self.nome = nome
        self.escolas = []

    def adicionar_escola(self, escola):
        if escola not in self.escolas:
            self.escolas.append(escola)
            escola.adicionar_professor(self)

    def detalhes(self):
        escolas = ', '.join([escola.nome for escola in self.escolas])
        return f'Professor: {self.nome}, Escolas: {escolas}'


class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []

    def adicionar_professor(self, professor):
        if professor not in self.professores:
            self.professores.append(professor)
            professor.adicionar_escola(self)

    def detalhes(self):
        professores = ', '.join([prof.nome for prof in self.professores])
        return f'Escola: {self.nome}, Professores: {professores}'


professor1 = Professor('Pedro Souza')
professor2 = Professor('Maria Souza')
escola1 = Escola('Escola A')
escola2 = Escola('Escola B')

professor1.adicionar_escola(escola1)
professor1.adicionar_escola(escola2)
professor2.adicionar_escola(escola2)

print(professor1.detalhes())
print(professor2.detalhes())
print(escola1.detalhes())
print(escola2.detalhes())
