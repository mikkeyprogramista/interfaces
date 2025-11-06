package pl.gornik.animal.model;

public class Fish implements Swimable {
    private final String name;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("...");
    }

    @Override
    public void swim() {
        System.out.println("Fish named " + name + " is swimming!");
    }
}
