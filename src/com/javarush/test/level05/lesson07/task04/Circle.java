package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    public void initialize(int centerX, int centerY, int radius)
    {
        centerX = 5;
        centerY = 4;
        radius = 10;
    }
    public void initialize(int centerX, int centerY, int radius, int width)
    {
        centerX = 5;
        centerY = 4;
        radius = 10;
        width = 6;
    }
    public void initialize(int centerX, int centerY, int radius, int width, String color)
    {
        centerX = 3;
                centerY = 4 ;
                radius = 5;
                width = 6;
                color = "Black";
    }
}
