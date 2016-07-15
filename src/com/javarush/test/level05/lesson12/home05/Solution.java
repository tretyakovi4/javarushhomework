package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int sum = 0;

       BufferedReader text = new BufferedReader(new InputStreamReader(System.in));

        for(String data = ""; !data.equals("сумма");)
        {
            data = text.readLine();
            if (!(data.equals("сумма")))
            {
                int num = Integer.parseInt(data);
                sum += num;

            }

        }

        System.out.println(sum);
        //напишите тут ваш код
    }
}
