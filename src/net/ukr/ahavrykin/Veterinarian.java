package net.ukr.ahavrykin;

public class Veterinarian {
    String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public Veterinarian() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Veterinarian: " + name;
    }

    public void treatment(Animal animal) {
        System.out.println(animal.toString());

    }

}
