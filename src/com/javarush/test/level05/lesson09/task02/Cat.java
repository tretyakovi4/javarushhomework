package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    String name = null;
    int weight = 6;
    int age = 4;
    String color = null;
    String address = null;

    public Cat(String name)
    {
        name = this.name;
    }

    public Cat(String name, int age, int weight)
    {
        name = this.name;
        age = this.age;
        weight = this.weight;
    }

    public Cat(String name, int age)
    {
        name = this.name;
        age = this.age;
    }

    public Cat(int weight, String color)
    {
        weight = this.weight;
        color = this.color;
    }

    public Cat(int weight, String color, String address)
    {
        weight = this.weight;
        color = this.color;
        address = this.address;
    }
}
