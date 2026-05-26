class Dog {
    String name;
    int age;
    String breed;
    boolean isSpinning;

    void bark() {
        System.out.println(name + " is barking!");
    }

    void spin() {
        isSpinning = true;
        System.out.println(name + " is spinning around!");
    }

    void run() {
        System.out.println(name + " is running fast!");
    }
}

public class PetDog {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.age = 3;
        myDog.breed = "Golden Retriever";
        myDog.isSpinning = false;

        System.out.println("Name: " + myDog.name);
        System.out.println("Age: " + myDog.age);
        System.out.println("Breed: " + myDog.breed);

        myDog.bark();
        myDog.spin();
        myDog.run();
    }
}