package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        String num3 = reader.readLine();
        String num4 = reader.readLine();

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = Integer.parseInt(num3);
        int n4 = Integer.parseInt(num4);

        if (n1 >= n2 && n1 >= n3 && n1 >= n4 )
            System.out.println (n1);
        else if (n2 >= n1 && n2 >= n3 && n2 >= n4)
            System.out.println(n2);
        else if (n3 >= n1 && n3 >= n2 && n3 >= n4 )
            System.out.println (n3);
        else if (n4 >= n1 && n4 >= n2 && n4 >= n3)
            System.out.println(n4);

    }
}
