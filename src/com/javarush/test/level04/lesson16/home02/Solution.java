package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a >= b && b <= c)
            System.out.println(c);
        else if (a <= c && a <= b)
            System.out.println(c);
        else if (b <= c && c <= b)
            System.out.println(c);
        else if (b <= a && a <= c)
            System.out.println(a);
        else if (c <= b && b <= a)
            System.out.println(b);
        else if (c <= a && a <= b)
            System.out.println(a);
    }
}
