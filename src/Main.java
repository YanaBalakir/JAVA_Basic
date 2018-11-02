import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        LinkedList<String> linkedList = new LinkedList();

        HashSet <String> hashSet = new HashSet<>();
        TreeSet <String> treeSet = new TreeSet<>();

        HashMap<String,String> hashMap = new HashMap();
        TreeMap <String,String> treeMap = new TreeMap();

        Lists lists = new Lists();
        Sets sets = new Sets();
        Maps maps = new Maps();

        System.out.println(" ---Add element---");

        lists.addToList(arrayList);
        System.out.println("ArrayList:"+lists.getTotalTime()+"ms");
        lists.addToList(linkedList);
        System.out.println("LinkedList:"+lists.getTotalTime()+"ms");

        System.out.println("---Find element ---");
        lists.searchInList(arrayList);
        System.out.println("ArrayList:"+lists.getTotalTime()+"ms");
        lists.searchInList(linkedList);
        System.out.println("LinkedList:"+lists.getTotalTime()+"ms");

        System.out.println("---Remove element");
        lists.removeFromList(arrayList);
        System.out.println("ArrayList:"+lists.getTotalTime()+"ms");
        lists.removeFromList(linkedList);
        System.out.println("LinkedList:"+lists.getTotalTime()+"ms");

        System.out.println(" ---Add element---");

        sets.addToSet(hashSet);
        System.out.println("HashSet:"+sets.getTotalTime()+"ms");
        sets.addToSet(treeSet);
        System.out.println("TreeSet:"+sets.getTotalTime()+"ms");

        System.out.println("---Find element ---");
        sets.searchSet(hashSet);
        System.out.println("HashSet:"+sets.getTotalTime()+"ms");
        sets.searchSet(treeSet);
        System.out.println("TreeSet:"+sets.getTotalTime()+"ms");

        System.out.println("---Remove element");
        sets.removeFromSet(hashSet);
        System.out.println("HashSet:"+sets.getTotalTime()+"ms");
        sets.removeFromSet(treeSet);
        System.out.println("TreeSet:"+sets.getTotalTime()+"ms");

        System.out.println(" ---Add element---");

        maps.addToMap(hashMap);
        System.out.println("HashMap:"+maps.getTotalTime()+"ms");
        maps.addToMap(treeMap);
        System.out.println("TreeMap:"+maps.getTotalTime()+"ms");

        System.out.println("---Find element ---");
        maps.searchMap(hashMap);
        System.out.println("HashSet:"+maps.getTotalTime()+"ms");
        maps.searchMap(treeMap);
        System.out.println("TreeSet:"+maps.getTotalTime()+"ms");

        System.out.println("---Remove element");
        maps.removeFromMap(hashMap);
        System.out.println("HashSet:"+maps.getTotalTime()+"ms");
        maps.removeFromMap(treeMap);
        System.out.println("TreeSet:"+maps.getTotalTime()+"ms");

    }
}
