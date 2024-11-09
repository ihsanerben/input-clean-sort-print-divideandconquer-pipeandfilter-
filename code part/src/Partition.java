import java.util.List;

public class Partition {
    public static int partition(List<String> data, int low, int high) {
        String pivot = data.get(high);
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (data.get(j).compareTo(pivot) <= 0) {
                i++;
                String temp = data.get(i);
                data.set(i, data.get(j));
                data.set(j, temp);
            }
        }

        String temp = data.get(i + 1);
        data.set(i + 1, data.get(high));
        data.set(high, temp);

        return i + 1;
    }
}
