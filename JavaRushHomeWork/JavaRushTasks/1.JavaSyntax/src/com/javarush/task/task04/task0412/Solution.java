package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(positive(Integer.parseInt(reader.readLine())));
    }

    public static int positive(int number) {
        if (number > 0) {
            number = number * 2;
        } else if (number < 0) {
            number = number + 1;
        }
        return number;
//напишите тут ваш код
    }
}
