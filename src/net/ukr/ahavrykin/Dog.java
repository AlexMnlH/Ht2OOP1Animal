package net.ukr.ahavrykin;

public class Dog extends Animal {
    String name;

    public Dog(String name, String color, int weight, String ration) {
        super(ration, color, weight);
        this.name = name;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog:" + name + "; " + super.toString();
    }

    @Override
    public String getVoice() {
        return "woof woof";
    }

    @Override
    public void eat(String food) {
        System.out.println(name + "питается " + food);
    }

    @Override
    public void sleep(int time) {
        System.out.println(name + "спит " + time + "ч.");
    }

}
