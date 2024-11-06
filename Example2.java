// Parent class
class Animal {
    // Method of parent class
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Dog
class Dog extends Animal {
    // Overridden method of Dog class
    @Override
    void makeSound() {
        System.out.println("The Dog barks.");
    }
}

// Subclass Cat
class Cat extends Animal {
    // Overridden method of Cat class
    @Override
    void makeSound() {
        System.out.println("The Cat meows.");
    }
}

public class Example2 {
    public static void main(String[] args) {
        // Object of parent class
        Animal animal = new Animal();
        
        // Object of subclass Dog
        Dog dog = new Dog();
        
        // Object of subclass Cat
        Cat cat = new Cat();

        // Method calls using objects
        System.out.println("Calling method on Animal object:");
        animal.makeSound();
        
        System.out.println("\nCalling method on Dog object:");
        dog.makeSound();
        
        System.out.println("\nCalling method on Cat object:");
        cat.makeSound();
    }
}
