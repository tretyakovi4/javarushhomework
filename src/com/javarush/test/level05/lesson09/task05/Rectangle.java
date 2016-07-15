package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/




public class Rectangle
{
    int left = 5;
    int top = 4;
    int width = 6;
    int height = 3;

    public Rectangle(int left, int top, int width, int height)
    {
        left = this.left;
        top = this.top;
        width = this.width;
        height = this.height;
    }

    public Rectangle(int width, int height)
    {
        width = this.width;
        height = this.height;
    }

    public Rectangle(int left, int top, int height)
    {
        left = this.left;
        top = this.top;
        height = this.width;
    }

    public Rectangle(Rectangle anotherRect)
    {
        anotherRect.width = this.width;
        anotherRect.height = this.height;
    }
}
