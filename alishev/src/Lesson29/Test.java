package Lesson29;

/**
 * Created by BR 29.06.2020
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);

        //Animal animal = new Dog();
        //animal.eat();

        /*
        animal.bark();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

         */

        /*
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        dog.eat();
         */
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
