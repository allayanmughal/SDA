public class Polymorphism {

    static class Animal {
        void makeSound() {
            System.out.println("Some generic animal sound");
        }
    }

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

    interface Pet {
        void play();
    }

    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();  // Output: Bark
        myCat.makeSound();  // Output: Meow

        Pet petDog = new Dog();
        Pet petCat = new Cat();

        petDog.play();  // Output: The dog is playing fetch.
        petCat.play();  // Output: The cat is playing with a ball of yarn.
    }
}
