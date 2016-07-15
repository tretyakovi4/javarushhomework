package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    public void initialize(String name)
    {
        name = "Bobik";
    }
    public void initialize(String name, int height )
    {
        name = "Here";
        height = 5;
    }
    public void initialize(String name,int height, String color)
    {
        name = "Tank";
        height = 5;
        color = "Black";
    }
}
