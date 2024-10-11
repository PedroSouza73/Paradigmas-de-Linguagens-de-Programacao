class Motor:
    def __init__(self, potencia):
        self.potencia = potencia

    def detalhes_motor(self):
        return f'Potência do motor: {self.potencia} HP'

class Carro:
    def __init__(self, marca, modelo, ano, potencia_motor):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.motor = Motor(potencia_motor)

    def detalhes(self):
        return f'{self.marca} {self.modelo}, Ano: {self.ano}, {self.motor.detalhes_motor()}'

carro = Carro('Toyota', 'Corolla', 2020, 150)

print(carro.detalhes())
