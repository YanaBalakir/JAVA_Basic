
import java.util.Date;
import java.util.List;

public class Lists {

    private long totalTime;
    public long getTotalTime() {
        return totalTime;
    }

    public void addToList(List<String> list) {
        Date start = new Date();
        for (int i = 0; i < 150000; i++) {
            list.add("Test");
        }
        Date finish = new Date();
        this.totalTime = finish.getTime() - start.getTime();

        }

    public void searchInList (List<String> list){
        Date start = new Date();
        for (int i = 0; i < 150000; i++) {
            list.get(i);
        }
        Date finish = new Date();
        this.totalTime = finish.getTime() - start.getTime();

    }

    public void removeFromList (List<String> list){
        Date start = new Date();
        for (int i = 0; i < 150000; i++) {
            list.remove("Test");
        }
        Date finish = new Date();
        this.totalTime = finish.getTime() - start.getTime();

    }

}
