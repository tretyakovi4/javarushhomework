package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    int a = 5;
    int b = 3;
    int c = 4;
    int d = 2;
    String color = "Green";
    public Circle(int centerX, int centerY, int radius)
    {
        centerX = this.a;
        centerY = this.b;
        radius = this.c;
    }

    public Circle(int centerX, int centerY, int radius, int width )
    {
        centerX = this.a;
        centerY = this.b;
        radius = this.c;
        width = this.d;
    }

    public Circle(int centerX, int centerY,  int radius, int width, String color)
    {
        centerX = this.a;
        centerY = this.b;
        radius = this.c;
        width = this.d;
        color = this.color;
    }
}
