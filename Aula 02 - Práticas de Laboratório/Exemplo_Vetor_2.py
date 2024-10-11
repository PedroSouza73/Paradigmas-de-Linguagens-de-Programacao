# Faça um programa em Python que receba do usuario 
# um vetor com 10 posições. Em seguida devera ser 
# impresso o maior e o menor elemento do vetor.

def main():
    # inicializar o vetor zerado.
    vetor = []

    # fazer a leitura e preenchimento dos elementos do vetor.
    for i in range(10):
        vetor.append(int(input("Digite o elemento %d: " % i)))

    # Inicializando as variáveis Maior e Menor.
    maior = vetor[0]
    menor = vetor[0]

    # Fazer o laço para armazenar os conteudos dos 

    # Elementos nas variáveis maior e menor.
    for i in range(1, len(vetor)):
        if vetor[i] > maior:
            maior = vetor[i]
        elif vetor[i] < menor:
            menor = vetor[i]

    # Exibir o resultado final das variáveis Maior e Menor.
    print("O maior elemento do vetor é %d." % maior)
    print("O menor elemento do vetor é %d." % menor)

# Programa Principal para chamar a função main..
if __name__ == "__main__":
    main()
