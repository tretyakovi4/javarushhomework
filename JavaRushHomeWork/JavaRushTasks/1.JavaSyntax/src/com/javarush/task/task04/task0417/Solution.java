package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a == b && a == c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a == b || a == c) {
            System.out.println(a + " " + a);
        } else if (b == c || b == a) {
            System.out.println(b + " " + b);
        }
    }
}
