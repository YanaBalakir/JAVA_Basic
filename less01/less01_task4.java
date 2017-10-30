package com.epam.jb.less01;

public class less01_task4 {
public static void main(String[] args) {
double a, b; // два катета
double c = 0; // гипотенуза
double s; // площадь
a = 7;
b = 9;
c = Math.sqrt(a * a + b * b);
s = 0.5 * a * b;
System.out.println("гипотенуза = " + c + " площадь = " + s);
}
}
