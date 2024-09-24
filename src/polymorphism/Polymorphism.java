// PolymorphismExample.java
public class Polymorphism {

    // Base class
    static class Animal {
        void makeSound() {
            System.out.println("Some generic animal sound");
        }
    }

    // Dog class extending Animal
    static class Dog extends Animal implements Pet {
        @Override
        void makeSound() {
            System.out.println("Bark");
        }

        @Override
        public void play() {
            System.out.println("The dog is playing fetch.");
        }
    }

    // Cat class extending Animal
    static class Cat extends Animal implements Pet {
        @Override
        void makeSound() {
            System.out.println("Meow");
        }

        @Override
        public void play() {
            System.out.println("The cat is playing with a ball of yarn.");
        }
    }

    // Pet interface
    interface Pet {
        void play();
    }

    // Main method
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Demonstrating polymorphism
        myDog.makeSound();  // Output: Bark
        myCat.makeSound();  // Output: Meow

        // Using the Pet interface
        Pet petDog = new Dog();
        Pet petCat = new Cat();

        petDog.play();  // Output: The dog is playing fetch.
        petCat.play();  // Output: The cat is playing with a ball of yarn.
    }
}
