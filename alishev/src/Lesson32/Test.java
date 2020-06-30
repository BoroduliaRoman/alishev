package Lesson32;

/**
 * Created by BR 29.06.2020
 */
public class Test {
    public static void main(String[] args) {
        /*
        Animal animal = new Animal();
        animal.eat();
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
         */

        /*
        Dog dog = new Dog();
        // Upcasting - Восходящее преобразование
        Animal animal = dog;

        // Downcasting - Нисходящее преобразование
        Dog dog2 = (Dog) animal;
        dog2.bark();
         */

        Animal a = new Animal();
        Dog dog = (Dog) a;
        dog.bark();
    }
}
