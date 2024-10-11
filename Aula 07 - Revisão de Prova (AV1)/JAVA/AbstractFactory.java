// Interface Abstract Factory
interface CarFactory {
    Sedan createSedan();
    SUV createSUV();
}

// Implementação da fábrica para Carros Toyota
class ToyotaFactory implements CarFactory {
    public Sedan createSedan() {
        return new ToyotaSedan();
    }

    public SUV createSUV() {
        return new ToyotaSUV();
    }
}

// Implementação da fábrica para Carros Ford
class FordFactory implements CarFactory {
    public Sedan createSedan() {
        return new FordSedan();
    }

    public SUV createSUV() {
        return new FordSUV();
    }
}

// Interface para os produtos
interface Sedan {
    void displayInfo();
}

interface SUV {
    void displayInfo();
}

// Implementações de produtos específicos para Toyota
class ToyotaSedan implements Sedan {
    public void displayInfo() {
        System.out.println("Toyota Corolla - Sedan");
    }
}

class ToyotaSUV implements SUV {
    public void displayInfo() {
        System.out.println("Toyota RAV4 - SUV");
    }
}

// Implementações de produtos específicos para Ford
class FordSedan implements Sedan {
    public void displayInfo() {
        System.out.println("Ford Fusion - Sedan");
    }
}

class FordSUV implements SUV {
    public void displayInfo() {
        System.out.println("Ford Explorer - SUV");
    }
}

// Função que utiliza a fábrica para criar carros
public class Main {
    public static void produceCars(CarFactory factory) {
        Sedan sedan = factory.createSedan();
        SUV suv = factory.createSUV();

        sedan.displayInfo();
        suv.displayInfo();
    }

    public static void AbstractFactory(String[] args) {
        System.out.println("Produzindo carros Toyota:");
        CarFactory toyotaFactory = new ToyotaFactory();
        produceCars(toyotaFactory);

        System.out.println("\nProduzindo carros Ford:");
        CarFactory fordFactory = new FordFactory();
        produceCars(fordFactory);
    }
}
