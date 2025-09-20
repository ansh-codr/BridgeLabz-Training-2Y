// Package omitted to keep compilation simple in this training repo
// Animal Hierarchy: Animal (superclass), Dog, Cat, Bird (subclasses)
// Demonstrates: inheritance, method overriding, and polymorphism

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows: Meow!");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " chirps: Tweet!");
    }
}

public class AnimalHierarchyMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
            new Dog("Buddy", 3),
            new Cat("Whiskers", 2),
            new Bird("Kiwi", 1)
        };

        for (Animal a : animals) {
            a.makeSound(); // Polymorphic call
        }
    }
}
