import java.util.Date;
import java.util.Map;


public class Maps {
    private long totalTime;
    public long getTotalTime() {
        return totalTime;
    }

    public void addToMap(Map <String,String> map) {
        Date start = new Date();
        for (int i = 0; i < 1500000; i++) {
            map.put("123","Test");
        }
        Date finish = new Date();
        this.totalTime = finish.getTime() - start.getTime();

    }

    public void searchMap(Map <String,String> map) {
        Date start = new Date();
        for (int i = 0; i < 1500000; i++) {
            map.get("123");
        }
        Date finish = new Date();
        this.totalTime = finish.getTime() - start.getTime();

    }

    public void removeFromMap(Map <String,String> map) {
        Date start = new Date();
        for (int i = 0; i < 1500000; i++) {
            map.clear();
        }
        Date finish = new Date();
        this.totalTime = finish.getTime() - start.getTime();

    }
}

