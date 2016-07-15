package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man name = new Man();
        name.name = "Den";
        Man age = new Man();
        age.age = 24;

        Woman name1 = new Woman();
        name1.name = "Kristy";
        Woman age1 = new Woman();
        age1.age = 21;
        //создай по два объекта каждого класса тут


    }

    public static class Man
    {
        String name = "null" ;
        int age = 0;
        String address = "null";

        public void initialize(String name, int age)
        {
            age = this.age;
            name = this.name;
        }
        public void initialize(String name, int age, String address)
        {
            name = this.name;
            age = this.age;
            address = this.address;
        }
        public void initialize(String address)
        {
            address = this.address;
        }
        public void initialize(int age)
        {
            age = this.age;
        }
    }
    public static class Woman
    {
        String name ;
        int age = 0;
        String address;
        public void initialize(String name, int age)
        {
            age = this.age;
            name = this.name;
        }
        public void initialize(String name, int age, String address)
        {
            name = this.name;
            age = this.age;
            address = this.address;
        }
        public void initialize(String address)
        {
            address = this.address;
        }
        public void initialize(int age)
        {
            age = this.age;
        }
    }

    //добавьте тут ваши классы
}
