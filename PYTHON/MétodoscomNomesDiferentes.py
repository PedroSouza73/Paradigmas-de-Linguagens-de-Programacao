class Calculadora:
    def somar(self, a, b, c=None):
        if c is None:
            return a + b
        else:
            return a + b + c

calc = Calculadora()

numeros = input('Digite dois ou três números separados por espaço: ').split()

numeros = [int(num) for num in numeros]

if len(numeros) == 2:
    print('Resultado da soma:', calc.somar(numeros[0], numeros[1]))
elif len(numeros) == 3:
    print('Resultado da soma:', calc.somar(numeros[0], numeros[1], numeros[2]))
else:
    print('Por favor, digite dois ou três números.')
    