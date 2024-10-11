class Animal:
    def som(self):
        pass

class Cachorro(Animal):
    def som(self):
        return 'Au Au!'

class Gato(Animal):
    def som(self):
        return 'Miau!'

dog = Cachorro()
cat = Gato()

print(f'Cachorro: {dog.som()}')
print(f'Gato: {cat.som()}')
