class Animal {

    void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void speak() {
        System.out.println("Dog says: Woof Woof");
    }
}

class Cat extends Animal {

    @Override
    void speak() {
        System.out.println("Cat says: Meow");
    }
}

class Cow extends Animal {

    @Override
    void speak() {
        System.out.println("Cow says: Moo");
    }
}

public class PolymorphicZoo {

    public static void main(String[] args) {

        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Cow()
        };

        for (Animal a : animals) {
            a.speak();
        }
    }
}