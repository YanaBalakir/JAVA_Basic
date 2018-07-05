package Figures;

import java.util.*;

// TODO: DK: Ты почти написала свою реализацию ArrayList. :) Лучше было использвоать готовую Имплементацию коллекции. ArrayList или LinkedList
public class List {

    Figure[] list = new Figure[50];
        int i = 0;

        public void add (Figure f){
        list[i++] = f;
    }

    // TODO: Форматирование кода. Начало имени метода и фигурная скобка закрытия обычно пишутся на одном уровне (Ctrl+Alt+L).
        public void printArea () {
            // TODO: лучше давать осмысленные имена, например "figure" или "item". Это не ошибка но так лучше воспринимается.
        for (Figure t : list) {
            if (t != null) {
                System.out.format("%.2f%n", t.area());
            }
        }
    }

        public void sortArea() {
        Arrays.sort(list, new Comparision());
        // TODO: DK: Небольшое дублирование кода. У тебя уже есть метод который выводит на экран площади. Можно было просто вызвать printArea () после сортировки.
        for (Figure t : list) {
            if (t != null) {
                System.out.println(t.area());
            }
        }
    }
    }



