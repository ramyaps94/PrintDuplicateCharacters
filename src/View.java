import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class View {
    public void display(String s) {
        System.out.println(s);
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void displayMap(Map<Character, Integer> characterIntegerMap) {
        Set<Map.Entry<Character, Integer>> entrySet = characterIntegerMap.entrySet();
        display("duplicate characters in the String are");
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("occurance of character " + entry.getKey() + "  is " + entry.getValue());
            }
        }
    }
}
