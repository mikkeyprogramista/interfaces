package pl.gornik.animal.model;

public class Cock implements Flyable, Runable {
    private final String name;

    public Cock(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Cock-a-doodle-doo!");
    }

    @Override
    public void fly() {
        System.out.println("Cock named " + name + " is flying!");
    }

    @Override
    public void run() {
        System.out.println("Cock named " + name + " is running!");
    }
}
