package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(dayName(Integer.parseInt(reader.readLine())));
    }


    public static String dayName(int number) {
        String day = "";
        if (number == 1 ) {
            day = "понедельник";
        }
        else if (number == 2){
            day = "вторник";
        }
        else if (number == 3){
            day = "среда";
        }
        else if (number == 4){
            day = "четверг";
        }
        else if (number == 5){
            day = "пятница";
        }
        else if (number == 6){
            day = "суббота";
        }
        else if (number == 7){
            day = "воскресенье";
        }
        return day;
    }
    //напишите тут ваш код
}
