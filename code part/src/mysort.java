import java.util.List;

public class mysort {
    public static List<String> sortData(List<String> data) {
        QuickSort.sort(data, 0, data.size() - 1);
        return data;
    }
}
