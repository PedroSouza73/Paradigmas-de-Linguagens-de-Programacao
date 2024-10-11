class SaldoInsuficienteException(Exception):
    def __init__(self, mensagem):
        super().__init__(mensagem)


class ContaBancaria:
    def __init__(self, titular, saldo_inicial=0):
        self.titular = titular
        self.saldo = saldo_inicial

    def depositar(self, valor):
        self.saldo += valor
        print(f'Depositado: R${valor}. Saldo atual: R${self.saldo}')

    def sacar(self, valor):
        if valor > self.saldo:
            raise SaldoInsuficienteException(f'Saldo insuficiente para sacar R${valor}. Saldo atual: R${self.saldo}')
        else:
            self.saldo -= valor
            print(f'Sacado: R${valor}. Saldo atual: R${self.saldo}')

try:
    conta = ContaBancaria('Pedro Souza', 100)
    conta.sacar(150)
except SaldoInsuficienteException as e:
    print(e)
    