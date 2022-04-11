package net.ukr.ahavrykin;

public class Cat extends Animal {
    String name;

    public Cat(String name, String color, int weight, String ration) {
        super(ration, color, weight);
        this.name = name;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat:" + name + "; " + super.toString();
    }

    @Override
    public String getVoice() {
        return "meow meow";
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
