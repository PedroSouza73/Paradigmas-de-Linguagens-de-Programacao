class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def __add__(self, outro_produto):
        return self.preco + outro_produto.preco

produto1 = Produto('Notebook', 2500)
produto2 = Produto('Mouse', 150)

total = produto1 + produto2
print(f'Total: R${total}')
