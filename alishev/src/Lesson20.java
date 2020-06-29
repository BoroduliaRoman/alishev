/**
 * Created by BR 28.06.2020
 */
public class Lesson20 {
    public static void main(String[] args) {
        Human1 human1 = new Human1("Bob", 40);
        //human1.toString();
        System.out.println(human1.toString());
    }
}

class Human1 {

    private String name;
    private int age;


    public Human1() {
        this.name = "Имя по умолчанию";
        this.age = 0;
        //System.out.println("Привет из первого конструктора!");
    }

    public String toString() {
        return name + ", " + age;
    }

    public Human1 (String name) {
        System.out.println("Привет из второго конструктора!");
        this.name = name;
    }

    public Human1 (String name, int age) {
        System.out.println("Привет из третьего конструктора!");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}