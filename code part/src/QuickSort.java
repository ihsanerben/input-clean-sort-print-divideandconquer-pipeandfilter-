import java.util.List;

public class QuickSort {
    public static void sort(List<String> data, int low, int high) {
        if (low < high) {
            int pi = Partition.partition(data, low, high);
            sort(data, low, pi - 1);
            sort(data, pi + 1, high);
        }
    }
}
