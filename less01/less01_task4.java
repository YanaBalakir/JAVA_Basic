package com.epam.jb.less01;

public class Triang {
public static void main(String[] args) {
double a, b; // два катета
double c = 0; // гипотенуза
double s; // площадь
a = 7;
b = 9;
c = Math.sqrt(a * a + b * b);
s = 0.5 * a * b;
System.out.println("Гипотенуза = " + c + " площадь = " + s);
}
}