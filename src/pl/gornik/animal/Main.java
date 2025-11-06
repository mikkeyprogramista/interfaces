package pl.gornik.animal;

import pl.gornik.animal.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Piesek"));
        animals.add(new Fish("Płaszczka"));
        animals.add(new Cock("Kacper"));

        for (Animal animal : animals) {
            animal.makeSound();

            if (animal instanceof Runable) {
                ((Runable) animal).run();
            }

            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }

            if (animal instanceof Swimable) {
                ((Swimable) animal).swim();
            }

            System.out.println();
        }
    }
}
