class ContaBancaria:
    def __init__(self, titular):
        self.__saldo = 0
        self.titular = titular

    def depositar(self, valor):
        if valor > 0:
            self.__saldo += valor
            print(f'Depositado: R${valor}. Saldo atual: R${self.__saldo}')
        else:
            print('Valor de depósito inválido.')

    def sacar(self, valor):
        if 0 < valor <= self.__saldo:
            self.__saldo -= valor
            print(f'Sacado: R${valor}. Saldo atual: R${self.__saldo}')
        else:
            print('Saldo insuficiente ou valor de saque inválido.')

    def exibir_saldo(self):
        return f'Titular: {self.titular}, Saldo atual: R${self.__saldo}'


conta = ContaBancaria('Pedro Souza')

conta.depositar(1000)
print(conta.exibir_saldo())

conta.sacar(500)
print(conta.exibir_saldo())

conta.sacar(600)
print(conta.exibir_saldo())
