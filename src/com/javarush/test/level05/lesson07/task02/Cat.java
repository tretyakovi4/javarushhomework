package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
1- Имя,
2- Имя, вес, возраст
3- Имя, возраст (вес стандартный)
4- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
5- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

    public class Cat {
        String data = null;
        int weighht = 5;
        int age = 13;

        public void initialize(String name) {

            name = "Vaska";

        }

        public void initialize(String name, int age, int weighht) {
            name = "vaska";
            age = 2;
            weighht = 5;
        }
        public void initialize(int weighht, int age, String name){
            name = "Barsik";
            age = 4;
            weighht = this.weighht;
        }
        public void initialize(String color, int weight, String name, String address, int age) {
            color = "Green";
            weight = 6;
            name = null;
            address = "MOscow";
            age = this.age;
            }
        public void initialize(int weighht, String color, String address){
            weighht = this.weighht;
            color = "Black";
            address = "Omsk";

        }

    }

