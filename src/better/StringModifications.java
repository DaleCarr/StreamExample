package better;

import java.util.ArrayList;
import java.util.List;

public class StringModifications {

    public static List<String> betterMethod(List<String> myStrings){
        List<String> newStrings = new ArrayList<>();
        for (String word:myStrings) {
            newStrings.add(word + "! ");
        }
        return newStrings;
    }
    public static void betterPrint(List<String> toPrint){
        for (String word:toPrint) {
            System.out.print(word);
        }
    }
}
