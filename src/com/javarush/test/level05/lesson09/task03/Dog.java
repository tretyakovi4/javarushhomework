package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    public Dog(String name)
    {
        name = "Bob";
    }
    public Dog(String name, int height)
    {
        name = "Bob";
        height = 20;
    }
    public Dog(String name, int height, String color)
    {
        name = "Bob";
        height = 20;
        color = "Gray";
    }
}
