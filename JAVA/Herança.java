abstract class Animal {
    abstract String som();
}

class Cachorro extends Animal {
    @Override
    String som() {
        return "Au Au!";
    }
}

class Gato extends Animal {
    @Override
    String som() {
        return "Miau!";
    }
}

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        System.out.println("Cachorro: " + cachorro.som());
        System.out.println("Gato: " + gato.som());
    }
}
