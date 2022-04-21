import java.util.Locale;
import java.util.TreeMap;

public class LetterCountingService {
    public void printCountedLetters(String word) {
        String wordLowerCased = word.toLowerCase(Locale.getDefault());
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < wordLowerCased.length(); i++) {
            if (map.containsKey(wordLowerCased.charAt(i))) {
                int oldValue = map.get(wordLowerCased.charAt(i));
                map.replace(wordLowerCased.charAt(i), ++oldValue);
            } else {
                map.put(wordLowerCased.charAt(i), 1);
            }
        }
        System.out.println("Counted letters: ");
        map.forEach((key, value) -> System.out.println(key + "=" + value));

    }
}
