import java.util.Date;
import java.util.Set;

public class Sets {

    private long totalTime;
    public long getTotalTime() {
        return totalTime;
    }

    public void addToSet(Set<String> set) {
        Date start = new Date();
        for (int i = 0; i < 1500000; i++) {
            set.add("Test");
        }
        Date finish = new Date();
        this.totalTime = finish.getTime() - start.getTime();

    }

    public void searchSet(Set <String> set) {
        Date start = new Date();
        for (int i = 0; i < 1500000; i++) {
            set.contains("Test");
        }
        Date finish = new Date();
        this.totalTime = finish.getTime() - start.getTime();

    }

    public void removeFromSet(Set <String> set) {
        Date start = new Date();
        for (int i = 0; i < 1500000; i++) {
            set.remove("Test");
        }
        Date finish = new Date();
        this.totalTime = finish.getTime() - start.getTime();

    }
}
