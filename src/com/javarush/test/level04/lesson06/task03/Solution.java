package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.nio.Buffer;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        String num3 = reader.readLine();

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int c = Integer.parseInt(num3);

        if (a >= b && b >= c )
            System.out.println(a+" "+b+" "+c);
        else if (b >= a && a >= c)
            System.out.println (b+" "+a+" "+c);
        else if (c >= a && a >= b)
            System.out.println (c+" "+a+" "+b);
        else if (c >= b && b >= a)
            System.out.println(c+" "+b+" "+a);
        else if (a >= c && c >= b)
            System.out.println(a+" "+c+" "+b);


    }
}
