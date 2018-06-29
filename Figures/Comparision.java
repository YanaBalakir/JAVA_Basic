package Figures;
import java.util.Comparator;

public class Comparision implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Figure f1 = (Figure) o1;
        Figure f2 = (Figure) o2;

        while (f1 != null && f2 != null) {
            if (f1.area() < f2.area())
                return -1;
            else if (f1.area() == f2.area())
                return 0;
            else if (f1.area() > f2.area())
                return 1;
        }

        return 0;
    }
}

