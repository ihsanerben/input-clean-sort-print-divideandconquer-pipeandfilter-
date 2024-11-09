import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EliminateFilter {
    public static String eliminatePunctuation(String fileName) throws IOException {
        StringBuilder text = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            line = line.replaceAll("[\\p{Punct}]", " ");
            text.append(line).append(" ");
        }
        reader.close();
        return text.toString();
    }
}
