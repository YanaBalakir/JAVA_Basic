package Figures;

import java.util.*;

public class List {

    Figure[] list = new Figure[50];
        int i = 0;

        public void add (Figure f){
        list[i++] = f;
    }

        public void printArea () {
        for (Figure t : list) {
            if (t != null) {
                System.out.format("%.2f%n", t.area());
            }
        }
    }

        public void sortArea() {
        Arrays.sort(list, new Comparision());

        for (Figure t : list) {
            if (t != null) {
                System.out.println(t.area());
            }
        }
    }
    }



