package com.javarush.test.level05.lesson05.task01;

/* Создать класс Cat
Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
*/

public class Cat {
    String name = "";
    int age = 0;
    int weight = 0;
    int strength = 0;


    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Vaska";
        cat1.age = 40;
        cat1.weight = 10;
        cat1.strength = 3;


    }
}
