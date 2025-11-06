package pl.gornik.animal.model;

public class Dog implements Runable {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Hau hau!");
    }

    @Override
    public void run() {
        System.out.println("Dog named " + name + " is running!");
    }
}
