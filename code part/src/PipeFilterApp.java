import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PipeFilterApp {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("HATA: java PipeFilterApp <file ismini yaz>");
            return;
        }

        String fileName = args[0];

        try {
            // noklatalama işaretlerini boşluk yaparak düzenliyoruz
            String cleanText = EliminateFilter.eliminatePunctuation(fileName);

            // temizlenmiş kelimeleri unique yapıyoz
            Set<String> uniqueWords = UniqueWordsFilter.extractUniqueWords(cleanText);

            // uniqued kelimeleri sortluyoruz
            List<String> uniqueWordsList = new ArrayList<>(uniqueWords);
            List<String> sortedWords = mysort.sortData(uniqueWordsList);

            // sonucu bastırıyoruz
            System.out.println("Sorted unique words:");
            for (String word : sortedWords) {
                System.out.println(word);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
