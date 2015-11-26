import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        View view = new View();
        FindDuplicateCharacters duplicateCharacters = new FindDuplicateCharacters();

        String menuOption = "1";

        do {
            view.display("Enter the String in which to find the duplicate characters");
            characterIntegerMap = duplicateCharacters.list(view.getInput());
            view.displayMap(characterIntegerMap);
            view.display("Enter 0 to quit and 1 to continue");
            menuOption = view.getInput();
        } while (!menuOption.equals("0"));
    }
}
