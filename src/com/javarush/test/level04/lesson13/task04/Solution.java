package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String s = "8";
        int m = 11;

        for (int i = 2; i < m; i ++ )
        {
            System.out.print(s);
        }
        for (int i = 0; i < m; i ++)
        {
            System.out.println(s);
        }
    }
}
