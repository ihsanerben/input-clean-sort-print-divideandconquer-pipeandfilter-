import java.util.ArrayList;
import java.util.List;

public class Blackboard {
    private List<String> data;

    public Blackboard() {
        data = new ArrayList<>();
    }

    public void addData(String element) {
        data.add(element);
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> newData) {
        data = newData;
    }
}
