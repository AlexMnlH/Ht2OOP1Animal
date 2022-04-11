package net.ukr.ahavrykin;

public class Animal {
    String ration;
    String color;
    int weight;

    public Animal(String ration, String color, int weight) {
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    public Animal() {
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public String toString() {
        return "Description: [ration - " + ration + ", color-" + color + ", weight-" + weight +
                "]";
    }

    public String meow() {
        return "meow meow";
    }

    public String vuf() {
        return "vuf vuf";
    }

    public void jump() {
        System.out.println("hop");
    }

    public String getVoice() {
        return "voice";
    }

    public void eat(String food) {
        System.out.println("Питается " + food);
    }

    public void sleep(int time) {
        System.out.println("Спит " + time + "ч.");
    }

}
