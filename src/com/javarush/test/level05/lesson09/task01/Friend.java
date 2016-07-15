package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String name = null;
    public Friend(String name)
    {
        this.name = name;
    }

    public Friend(int age, String name)
    {
        this.name = name + age;
    }
    public Friend(int age, String name, String sex)
    {
       this.name = age + name + sex;
    }


}