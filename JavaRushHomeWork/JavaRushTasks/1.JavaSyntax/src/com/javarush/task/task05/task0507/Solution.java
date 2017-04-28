package com.javarush.task.task05.task0507;

/*
Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double mid = 0;
        int count = 0;
        while (true) {
            int a = Integer.parseInt(reader.readLine());
            if (a != -1) {
                mid = (mid + a);
                count++;
            } else {
                System.out.println(mid / count);
                break;
            }
        }
    }
}

