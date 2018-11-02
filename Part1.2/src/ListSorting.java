import java.util.*;

public class ListSorting {

    public static void main(String[] args) {
        sortArrayByLength(new String[]{"qwerty qwerty qwerty", "qwert", "qwerty", "qw"});
        sortListByLength(new ArrayList<>(
                Arrays.asList("qwerty qwerty qwerty", "qwert", "qwerty", "qw")));
    }

    private static void sortListByLength(List<String> list) {
        System.out.println("sorting list");
        Collections.sort(list, Comparator.comparing(String::length));
        list.forEach(System.out::println);
    }

    private static void sortArrayByLength(String[] stringArray) {
        System.out.println("sorting array");
        Arrays.sort(stringArray, Comparator.comparing(String::length));
        Arrays.stream(stringArray).forEach(System.out::println);
    }
}