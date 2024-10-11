class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0

    def detalhes(self):
        return f'{self.marca} {self.modelo}, Ano: {self.ano}, Velocidade: {self.velocidade} km/h'

    def acelerar(self, incremento):
        self.velocidade += incremento
        print(f'O carro acelerou para {self.velocidade} km/h')

    def frear(self, decremento):
        self.velocidade -= decremento
        if self.velocidade < 0:
            self.velocidade = 0
        print(f'O carro desacelerou para {self.velocidade} km/h')

    def exibir_velocidade(self):
        return f'Velocidade atual: {self.velocidade} km/h'

carro1 = Carro('Toyota', 'Corolla', 2020)
carro2 = Carro('Honda', 'Civic', 2018)
carro3 = Carro('Ford', 'Mustang', 2022)

carro1.acelerar(30)
carro1.frear(10)
print(carro1.exibir_velocidade())

carro2.acelerar(50)
carro2.frear(20)
print(carro2.exibir_velocidade())

carro3.acelerar(70)
carro3.frear(50)
print(carro3.exibir_velocidade())

print(carro1.detalhes())
print(carro2.detalhes())
print(carro3.detalhes())
