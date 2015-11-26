import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {

    public Map<Character, Integer> list(String input) {
        char[] characters = input.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for (Character ch : characters) {
            if (charMap.containsKey(ch))
                charMap.put(ch, charMap.get(ch) + 1);
            else
                charMap.put(ch, 1);
        }
        return charMap;
    }
}
