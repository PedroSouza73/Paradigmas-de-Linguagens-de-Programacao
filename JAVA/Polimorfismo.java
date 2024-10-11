import java.util.ArrayList;
import java.util.List;

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
    public static void emitirSons(List<Animal> animais) {
        for (Animal animal : animais) {
            System.out.println(animal.som());
        }
    }

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(gato);

        emitirSons(animais);
    }
}
