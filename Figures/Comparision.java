package Figures;
import java.util.Comparator;

public class Comparision implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        /** TODO: DK:   В java есть тема generics , можно параметризировать класс.
         *
         * В твоём случае данный класс предполагается использовать для сравнения "Figure"
         * и больше никакие другие классы он не сможет сравнивать (т.к. ты деалаешь приведение типов).
         *
         * С generics не нужно будет делать приаедение типов и уже на этапе компиляции, компилятор не даст
         * использовать этот класс для сравнения других оюъектов.
         *
         *        public class Comparision implements Comparator<Figure> {
         *
         *
         *     @Override
         *     public int compare(Figure f1, Figure f2) {}
         *
         */
        Figure f1 = (Figure) o1;
        Figure f2 = (Figure) o2;

        /**
         *  TODO: DK: Не совсем понятно для чего нужен цикл while , можешь рассказать?
         *
         *  Судя по коду если один объект будет null, а второй нет будет возвращено 0, т.е. объекты равны что неверно.
         *
         */
        while (f1 != null && f2 != null) {
            if (f1.area() < f2.area())
                return -1;
            else if (f1.area() == f2.area())
                return 0;
            // TODO: DK: третий раз If можно было не писать, а сразу возвращать 1. Тогда можно было бы не писать следующую строчку return 0; после цикла.
            else if (f1.area() > f2.area())
                return 1;
        }

        return 0;
    }
}

