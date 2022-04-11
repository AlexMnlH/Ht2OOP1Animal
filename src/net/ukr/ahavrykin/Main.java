package net.ukr.ahavrykin;

public class Main {
    public static void main(String[] args) {

        Veterinarian vet1 = new Veterinarian();
        vet1.name = "Gregory";

        Cat cat1 = new Cat();
        cat1.name = "Vasyl";
        cat1.color = "White";
        cat1.weight = 5;
        cat1.ration = "Royal Canin";

        System.out.println(vet1.toString());
        vet1.treatment(cat1);
        System.out.println(cat1.getVoice());
        cat1.sleep(3);

        Dog dog1 = new Dog("Jack", "Brown", 7,
                "Purina");
        vet1.treatment(dog1);
        System.out.println(dog1.getVoice());
        dog1.sleep(2);
    }
}
