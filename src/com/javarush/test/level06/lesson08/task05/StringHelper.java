package com.javarush.test.level06.lesson08.task05;

/* Класс StringHelper
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку повторенную count раз.
String multiply(String s) – возвращает строку повторенную 5 раз.
Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
*/

public class StringHelper
{
    public static void main(String[] args)
    {
        //System.out.print(multiply("Амиго"));
        System.out.print(multiply("Амиго", 3));
    }

    public static String multiply(String s)
    {

        String result = "";
        for (int i = 0; i < 5; i++)
        {
            System.out.print(s);
        }
        //напишите тут ваш код
        return result;
    }

    public static String multiply(String s, int count)
    {
        String result = "";
        for (int i = 0; i <= count; i++)
        {
            result = s;
            //System.out.print(s);
        }
         System.out.print(result+2);
        //напишите тут ваш код
        return result;
    }
}
