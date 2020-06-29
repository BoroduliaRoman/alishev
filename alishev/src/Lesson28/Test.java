package Lesson28;

import Lesson28.Packet1.Person;

/**
 * Created by BR 29.06.2020
 */
public class Test extends Person{
    //protected int id;

    public Test() {
        name = "Tom";
    }

    public static void main(String[] args) {
        // public, private, default(всё что default доступно в пределах этого пакета), protected(доступны в пределах
        // одного пакета, доступны всем подклассам, даже если эти подклассы вне пакета, где эти поля и методы были
        // декларированы)

        //System.out.println(Person.CONSTANT);


    }

    /*
    private void technicalMethod() {

    }
     */
}

/*
class Test2 {

}
 */