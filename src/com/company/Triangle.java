package com.company;
//  Triangle деген класс тузунуз.
//  Класстын 3 полеси болсун a, b, c.
//  Класстын "area" деген методу болсун.
//  "area" методу полелериндеги
//  маалыматтарга(маалымат объектти тузгондон кийин берилет)
//  таянып консолго уч бурчтуктун аянтын чыгарсын.


public class Triangle {
    int a;
    int b;
    int c;

    void area(int a, int b, int c) {
        System.out.println(a * b * c + "  = area of Triangle");
    }
}