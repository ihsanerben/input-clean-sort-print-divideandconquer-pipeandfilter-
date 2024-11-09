import java.util.HashSet;
import java.util.Set;

public class UniqueWordsFilter {
    public static Set<String> extractUniqueWords(String text) {
        Set<String> uniqueWords = new HashSet<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        return uniqueWords;
    }
}
