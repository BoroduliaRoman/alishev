/**
 * Created by BR 28.06.2020
 */
public class ClassesAndObjects1 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.setName("fgdf");
        person1.setAge(-4);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());
    }
}

class Person1 {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Ты ввёл пустое имя!");
        } else {
            name = userName;
        }

    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Возраст должен быть положительным!");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
        }
    }
}