# Interface Abstract Factory
class FabricaCarro:
    def produz_sedan(self):
        pass

    def produz_suv(self):
        pass


# Implementação da fábrica para Carros Toyota
class FabricaToyota(FabricaCarro):
    def produz_sedan(self):
        return SedanToyota()

    def produz_suv(self):
        return SUVToyota()


# Implementação da fábrica para Carros Ford
class FabricaFord(FabricaCarro):
    def produz_sedan(self):
        return SedanFord()

    def produz_suv(self):
        return SUVFord()


# Interface para os produtos
class Sedan:
    def exibir_info(self):
        pass


class SUV:
    def exibir_info(self):
        pass


# Implementações de produtos específicos para Toyota
class SedanToyota(Sedan):
    def exibir_info(self):
        print("Toyota Corolla - Sedan")


class SUVToyota(SUV):
    def exibir_info(self):
        print("Toyota RAV4 - SUV")


# Implementações de produtos específicos para Ford
class SedanFord(Sedan):
    def exibir_info(self):
        print("Ford Fusion - Sedan")


class SUVFord(SUV):
    def exibir_info(self):
        print("Ford Explorer - SUV")


# Função que utiliza a fábrica para criar carros
def produzir_carros(fabrica):
    sedan = fabrica.produz_sedan()
    suv = fabrica.produz_suv()

    sedan.exibir_info()
    suv.exibir_info()


# Exemplo de uso do padrão Abstract Factory
if __name__ == "__main__":
    print("Produzindo carros Toyota:")
    fabrica_toyota = FabricaToyota()
    produzir_carros(fabrica_toyota)

    print("\nProduzindo carros Ford:")
    fabrica_ford = FabricaFord()
    produzir_carros(fabrica_ford)
