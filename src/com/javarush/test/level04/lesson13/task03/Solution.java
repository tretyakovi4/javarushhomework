package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String s = "8" ;
       int m = 10;
        for (int i = 1; i<=m; i++)
        {
            for (int j = i; j > 0;j--) {
                System.out.print(s);
            }
            System.out.println();
        }

    }
}
