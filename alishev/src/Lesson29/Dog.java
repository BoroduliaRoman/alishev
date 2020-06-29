package Lesson29;

/**
 * Created by BR 29.06.2020
 */
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    public void bark() {
        System.out.println("Dog is barking...");
    }
}
