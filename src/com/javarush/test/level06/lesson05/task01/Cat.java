package com.javarush.test.level06.lesson05.task01;

/* Метод finalize класса Cat
В классе Cat создать метод protected void finalize() throws Throwable
*/

public class Cat
{
    String cat1;
    Cat (String cat2 )
    {
        this.cat1 = cat2;
    }
    //напишите тут ваш код
    protected void finalize() throws Throwable
    {
    }

}

