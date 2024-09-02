// Interface
interface Animal {
    void eat();
}

// Another Interface
interface Pet {
    void play();
}

// Base class
class Mammal {
    void breathe() {
        System.out.println("Mammal is breathing.");
    }
}

// Class that implements multiple interfaces and extends another class
class Dog extends Mammal implements Animal, Pet {
    // Implementation of eat method from Animal interface
    public void eat() {
        System.out.println("Dog is eating.");
    }
    
    // Implementation of play method from Pet interface
    public void play() {
        System.out.println("Dog is playing.");
    }
    
    // Additional method in Dog class
    void bark() {
        System.out.println("Dog is barking.");
    }
}





// Another subclass that extends the base class Mammal
class Cat extends Mammal {
    // Implementation of eat method from Animal interface
    void meow() {
        System.out.println("Cat is meowing.");
    }
}

public class PK {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog();
        
        // Create an object of the Cat class
        Cat myCat = new Cat();
        
        // Call methods from the Dog class
        myDog.eat();   // From Animal interface
        myDog.play();  // From Pet interface
        myDog.bark();  // From Dog class
        myDog.breathe(); // From Mammal class
        
        // Call methods from the Cat class
        myCat.meow();  // Specific to Cat class
        myCat.breathe(); // From Mammal class
    }
}
